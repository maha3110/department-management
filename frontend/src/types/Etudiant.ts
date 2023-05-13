interface EtudiantBrief {
  id: number;
  nom: string;
  prenom: string;
  dateNaissance: Date;
}

interface Etudiant extends EtudiantBrief{
    email: string,
    adresse: string,
    telephone: string,
}
