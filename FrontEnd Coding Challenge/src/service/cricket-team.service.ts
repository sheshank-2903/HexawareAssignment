import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CricketTeam } from 'src/model/cricketTeam';

@Injectable({
  providedIn: 'root'
})
export class CricketTeamService {

  constructor(private _http: HttpClient) { }

  baseUrl: string = 'http://localhost:8080/api/player/';

  updateCrickerTeam(body: CricketTeam): Observable<CricketTeam> {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
    });

    return this._http.put<CricketTeam>(
      this.baseUrl + 'update-player-JerseyId',
      body,
      { headers, responseType: 'json' }
    );
  }
}
