interface PageInfo {
  size: number;
  totalElements: number;
  totalPages: number;
  number: number;
}

interface PageParams {
  page: number;
  size: number;
  sort: string;
}
