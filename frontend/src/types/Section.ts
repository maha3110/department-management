interface Section {
  id: number;
  name: string;
  niveau: number;
  annee_scolaire: string;
}

interface SectionDetail extends Section {
  cours: Array<Cours>;
}
