import { Utils } from "./Utils";

export const EtudiantService = {
  getAll: async (
    page = 0,
    size = 20,
    sort = "nom"
  ): Promise<{ data: Array<EtudiantBrief>; pageInfo: PageInfo }> => {
    const response = await fetch(
      "http://localhost:9292/api/etudiants?" +
        new URLSearchParams({
          page: page.toString(),
          size: size.toString(),
          sort,
        })
    );
    const { data, pageInfo } = await response.json().then((json) => {
      const etudiants = json._embedded.etudiants as Array<any>;
      return {
        data: etudiants.map((etudiant) => {
          return {
            id: Utils.getIdFromLink(etudiant) as number,
            nom: etudiant.nom,
            prenom: etudiant.prenom,
            dateNaissance: etudiant.dateNaissance,
          };
        }),
        pageInfo: json.page,
      };
    });
    return { data, pageInfo };
  },
  getById: async (id: number): Promise<Etudiant> => {
    const response = await fetch("http://localhost:9292/api/etudiants/" + id);
    const data = await response.json();
    return {
      id: Utils.getIdFromLink(data) as number,
      nom: data.nom,
      prenom: data.prenom,
      dateNaissance: data.dateNaissance,
      email: data.email,
      adresse: data.adresse,
      telephone: data.telephone,
    };
  },
};
