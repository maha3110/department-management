export class SectionService {
  public async getAll(): Promise<Array<Section>> {
    const response = await fetch(
      "https://api.mockaroo.com/api/4c0d2bf0?count=50&key=886ff760"
    );
    return await response.json();
  }

  public async search(filters: {
    nom: string;
    niveau?: number;
  }): Promise<Array<Section>> {
    const response = await fetch(
      "https://api.mockaroo.com/api/4c0d2bf0?count=50&key=886ff760"
    );
    let data = (await response.json()) as Array<Section>;
    data = data.filter((section) => section.name.includes(filters.nom));
    if (filters.niveau){
      data = data.filter((section) => section.niveau === filters.niveau);
    }
    return data;
  }

  public async getById(id : number):Promise<SectionDetail>{
    const response = await fetch(
      "https://my.api.mockaroo.com/section/"+id.toString()+"?key=886ff760"
    );
    return await response.json();
  }

  public async getEtudiants(id:number, annee_scolaire: string): Promise<Array<Etudiant>> {
    const response = await fetch("https://my.api.mockaroo.com/sections/123/etudiants?key=886ff760")
  }
}
