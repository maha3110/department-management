import { Utils } from "./Utils";

const RESOURCE_NAME = "courses";
const PROJECTIONS = "cours";

export const CoursService = {
  getAll: async (
    page: PageParams = { page: 0, size: 20, sort: "nom" }
  ): Promise<{ data: Array<Cours>; pageInfo: PageInfo }> => {
    const params = Utils.pageInfoToParams(page);
    const url = Utils.generateUrl(
      RESOURCE_NAME,
      undefined,
      PROJECTIONS,
      params
    );
    const response = await fetch(url);
    return await response.json().then((result) => {
      return {
        data: result._embedded.courses.map(format),
        pageInfo: result.page,
      };
    });
  },
  getById: async (id: number): Promise<Cours> => {
    const url = Utils.generateUrl(RESOURCE_NAME, id, PROJECTIONS);
    const response = await fetch(url);
    return await response.json().then(format);
  },
  add: async (cours: Omit<Cours, "id">): Promise<Cours> => {
    const response = await fetch(
      Utils.generateUrl(RESOURCE_NAME, undefined, PROJECTIONS),
      {
        method: "POST",
        body: JSON.stringify(cours),
      }
    );
    return await response.json().then(format);
  },
  update: async (cours: Cours): Promise<boolean> => {
    const id = cours.id;
    const response = await fetch(Utils.generateUrl(RESOURCE_NAME, id), {
      method: "PUT",
      body: JSON.stringify(cours),
    });
    return response.ok;
  },
  delete: async (id: number): Promise<boolean> => {
    const response = await fetch(Utils.generateUrl(RESOURCE_NAME, id), {
      method: "DELETE",
    });
    return response.ok;
  },
};

function format(data: any) {
  return {
    id: Utils.getIdFromLink(data) as number,
    code: data.code,
    nom: data.nom,
    volumeHoraire: data.volumeHoraire,
    type: data.type,
  };
}
