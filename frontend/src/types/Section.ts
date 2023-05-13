interface SectionBrief {
  id: number;
  nom: string;
  niveau: number;
}

interface Section extends SectionBrief {
  cours: Array<Cours>;
  cordinateur: any;
}
