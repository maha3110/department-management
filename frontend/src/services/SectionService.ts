import { Utils } from "./Utils";

const RESOURCE_NAME = "sections";
const PROJECTIONS = ["sections", "sectionDetail"];

export const SectionService = {
  getAll: async (
    page: PageParams = { page: 0, size: 20, sort: "nom" }
  ): Promise<{ data: Array<SectionBrief>; pageInfo: PageInfo }> => {
    const params = Utils.pageInfoToParams(page);
    const url = Utils.generateUrl(
      RESOURCE_NAME,
      undefined,
      PROJECTIONS[0],
      params
    );
    const response = await fetch(url);
    return await response.json().then((result) => {
      return {
        data: result._embedded.sections.map(format),
        pageInfo: result.page,
      };
    });
  },
  search: async (
    page: PageParams = { page: 0, size: 20, sort: "nom" },
    filters: { nom: string; niveau?: number }
  ): Promise<{ data: Array<SectionBrief>; pageInfo: PageInfo }> => {
    const params = Utils.pageInfoToParams(page);
    params.append("nom", filters.nom);
    if (filters.niveau) params.append("niveau", filters.niveau.toString());
    const url = Utils.generateUrl(
      RESOURCE_NAME,
      undefined,
      PROJECTIONS[0],
      params
    );
    const response = await fetch(url);
    return await response.json().then((result) => {
      return { data: result._embedded.sections, pageInfo: result.page };
    });
  },
  getById: async (id: number): Promise<Section> => {
    const url = Utils.generateUrl(RESOURCE_NAME, id, PROJECTIONS[1]);
    const response = await fetch(url);
    return await response.json().then(format);
  },
  add: async (section: Omit<Section, "id">): Promise<Section> => {
    const response = await fetch(
      Utils.generateUrl(RESOURCE_NAME, undefined, PROJECTIONS[1]),
      {
        method: "POST",
        body: JSON.stringify(section),
      }
    );
    return await response.json().then(format);
  },
  update: async (section: Section): Promise<boolean> => {
    const id = section.id;
    const response = await fetch(Utils.generateUrl(RESOURCE_NAME, id), {
      method: "PUT",
      body: JSON.stringify(section),
    });
    return response.ok;
  },
  delete: async (id: number): Promise<boolean> => {
    const response = await fetch(Utils.generateUrl(RESOURCE_NAME, id), {
      method: "DELETE",
    });
    return response.ok;
  },

  // getEtudiants: async (
  //   id: number,
  //   annee_scolaire: string
  // ): Promise<Array<Etudiant>> => {
  //   const response = await fetch(
  //     "https://my.api.mockaroo.com/sections/123/etudiants?key=886ff760"
  //   );
  //},
};

function format(data: any) {
  return {
    id: Utils.getIdFromLink(data) as number,
    nom: data.nom,
    niveau: data.niveau,
    cours: data?.cours as Array<Cours>,
    cordinateur: data?.cordinateur,
  };
}
