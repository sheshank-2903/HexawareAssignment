import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CricketTeam } from 'src/model/cricketTeam';
import { CricketTeamService } from 'src/service/cricket-team.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  cricketTeamForm!: FormGroup;

  constructor(private formBuilder: FormBuilder, private cricketTeamService: CricketTeamService) {
    this.cricketTeamForm = this.formBuilder.group({
      playerId: ['', [Validators.required]],
      playerName: ['', [Validators.required,Validators.pattern(/^[a-zA-Z]+$/)]],
      jerseyNumber: ['', [Validators.required]],
      role: ['', [Validators.required]],
      totalMatches: ['', [Validators.required]],
      teamName: ['', [Validators.required,Validators.pattern(/^[a-zA-Z]+$/)]],
      country: ['', [Validators.required,Validators.pattern(/^[a-zA-Z]+$/)]],
      state: ['', [Validators.required,Validators.pattern(/^[a-zA-Z]+$/)]],
      description: ['', [Validators.required]]
    });
  }

  get getCricketTeam() {
    return this.cricketTeamForm.controls;
  }

  onSubmitCricketTeam() {
    if (this.cricketTeamForm.invalid) {
      return;
    }
    const cricketTeam: CricketTeam = {
      playerId: this.cricketTeamForm.value.playerId,
      playerName: this.cricketTeamForm.value.playerName,
      jerseyNumber: this.cricketTeamForm.value.jerseyNumber,
      role: this.cricketTeamForm.value.role,
      totalMatches: this.cricketTeamForm.value.totalMatches,
      teamName: this.cricketTeamForm.value.teamName,
      country: this.cricketTeamForm.value.country,
      state: this.cricketTeamForm.value.state,
      description: this.cricketTeamForm.value.description
    };
    console.log(cricketTeam);
    this.cricketTeamService.updateCrickerTeam(cricketTeam)
      .subscribe(
        (cricketTeam) => {
          alert('You have been Registered Successfully');
          this.cricketTeamForm.reset();
        }
      );
  }
}
