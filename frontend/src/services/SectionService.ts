export class SectionService {
  public async getAll(): Promise<Array<Section>> {
    const response = await fetch(
      "https://api.mockaroo.com/api/4c0d2bf0?count=50&key=886ff760"
    );
    return await response.json();
  }

  public async getByAnneeScolaire(
    annee_scolaire: number
  ): Promise<Array<Section>> {
    const response = await fetch(
      "https://api.mockaroo.com/api/4c0d2bf0?count=50&key=886ff760"
    );
    const data = (await response.json()) as Array<Section>;
    return data.filter((section) =>
      section.annee_scolaire.split("-")[0].includes(annee_scolaire.toString())
    );
  }

  public async search(filters: {
    nom?: string;
    niveau?: number;
    annee_scolaire?: number;
  }): Promise<Array<Section>> {
    const response = await fetch(
      "https://api.mockaroo.com/api/4c0d2bf0?count=50&key=886ff760"
    );
    let data = (await response.json()) as Array<Section>;
    if (filters.nom)
      data = data.filter((section) => section.name.includes(filters.nom!));
    if (filters.niveau)
      data = data.filter((section) => section.niveau === filters.niveau);
    if (filters.annee_scolaire)
      data = data.filter((section) =>
        section.annee_scolaire
          .split("-")[0]
          .includes(filters.annee_scolaire!.toString())
      );
    return data;
  }

  public async getById(id : number):Promise<Section>{
    const response = await fetch(
      "https://my.api.mockaroo.com/section/"+id.toString()+"?key=886ff760"
    );
    return await response.json();
  }
}
