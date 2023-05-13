export const Utils = {
  getIdFromLink: (object: { _links: any }): number | string => {
    const link = object._links.self.href as string;
    const id = link.split("/").at(-1)!;
    return isNaN(+id) ? id : +id;
  },
  generateUrl: (
    resourceName: string,
    id?: number | string,
    projectionName?: string,
    params?: URLSearchParams
  ): string => {
    let url = "http://localhost:9292/api/" + resourceName;
    if (id) url += '/' + id;
    if (projectionName && params) {
      params.append("projection", projectionName);
      url += "?" + params;
    } else if (params) {
      url += "?" + params;
    } else {
      url += "?projection=" + projectionName;
    }
    return url;
  },
  pageInfoToParams: (pageParam: PageParams) => {
    const params = {
      page: pageParam.page.toString(),
      size: pageParam.size.toString(),
      sort: pageParam.sort,
    };
    return new URLSearchParams(params);
  },
};
