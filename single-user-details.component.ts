import { Component, OnInit } from '@angular/core';
import { UserDetailsService } from '../user-details.service';
import { UserDetails } from '../user-details/UserDetails';

@Component({
  selector: 'app-single-user-details',
  templateUrl: './single-user-details.component.html',
  styleUrls: ['./single-user-details.component.css']
})
export class SingleUserDetailsComponent implements OnInit {

  userDetails!: UserDetails;

  constructor(private uds: UserDetailsService) { }

  ngOnInit(): void {
  }

  anyNumber!: number;
  
  loadSingleUserDetails(x : number) {
    this.uds.loadUserDetailsByIdService(x).subscribe(
        (data) => {
          this.userDetails = data;
        },
        (err) => {
          console.log(err);
        }
    );
  }

}
