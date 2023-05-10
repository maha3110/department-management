export const Utils = {
  getIdFromLink: (object: { _links: any }): number | string => {
    const link = object._links.self.href as string;
    const id = link.split("/").at(-1)!;
    return isNaN(+id)? id : +id;
  },
};
