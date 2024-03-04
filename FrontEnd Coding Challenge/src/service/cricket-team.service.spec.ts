import { TestBed } from '@angular/core/testing';

import { CricketTeamService } from './cricket-team.service';

describe('CricketTeamService', () => {
  let service: CricketTeamService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CricketTeamService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
