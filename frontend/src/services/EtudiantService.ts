import { Utils } from "./Utils";

const RESOURCE_NAME = "etudiants";
const PROJECTIONS = ["etudiants", "etudiantDetail"];

export const EtudiantService = {
  getAll: async (
    page: PageParams = { page: 0, size: 20, sort: "nom" }
  ): Promise<{ data: Array<EtudiantBrief>; pageInfo: PageInfo }> => {
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
        data: result._embedded.etudiants.map(format),
        pageInfo: result.page,
      };
    });
  },
  getById: async (id: number): Promise<Etudiant> => {
    const url = Utils.generateUrl(RESOURCE_NAME, id, PROJECTIONS[1]);
    const response = await fetch(url);
    return await response.json().then(format);
  },
  add: async (etudiant: Omit<Etudiant, "id">): Promise<Etudiant> => {
    const response = await fetch(
      Utils.generateUrl(RESOURCE_NAME, undefined, PROJECTIONS[1]),
      {
        method: "POST",
        body: JSON.stringify(etudiant),
      }
    );
    return await response.json().then(format);
  },
  update: async (etudiant: Etudiant): Promise<boolean> => {
    const id = etudiant.id;
    const response = await fetch(Utils.generateUrl(RESOURCE_NAME, id), {
      method: "PUT",
      body: JSON.stringify(etudiant),
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
    nom: data.nom,
    prenom: data.prenom,
    dateNaissance: data.dateNaissance,
    email: data?.email,
    adresse: data?.adresse,
    telephone: data?.telephone,
  };
}
