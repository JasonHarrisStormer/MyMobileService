import { Component, OnInit } from '@angular/core';
import { Navigation } from '@angular/router';


@Component({
  selector: 'app-s23',
  templateUrl: './s23.component.html',
  styleUrls: ['./s23.component.css']
})
export class S23Component implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  addS23(){
    console.log('verify login and either send them to login, or to the confirm purchase page here')
    // if( isLoggedIn() == true){
    //   //navigate to S23 store purchase page
    // }else{
    //   //navigate to login page, THEN to store purchase page for S23
    // }
  }
}
