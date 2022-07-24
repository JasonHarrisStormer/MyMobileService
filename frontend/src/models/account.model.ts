import {Lines} from "./lines.models"
export class Account {

    email: string;
    phoneNumber:number;
    firstname: string;
    lastname: string;
    address: string;
    address2: string;
    city: string;
    state: string;
    zipcode: number;
    password: string;
    line: Lines[];

    constructor (email: string, phoneNumber: number, firstname: string, lastname: string, address: string,
      address2: string, city: string, state: string, zipcode: number, password:string,line:[]) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.line = line;
        this.password = password;
    }
}
