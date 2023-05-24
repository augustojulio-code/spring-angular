import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  constructor(private http: HttpClient) { }

  list() {
    return [
      { _id: '1', name: 'Angular', category: 'Front-end' }
    ];
  }
}
