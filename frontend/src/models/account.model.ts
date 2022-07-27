import {Lines} from "./lines.models"
export class Account {

    id: number;
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
    lines: Lines[];
    balance: number;
    phoneBal: number;

    constructor (id: number, email: string, phoneNumber: number, firstname: string, lastname: string, address: string,
      address2: string, city: string, state: string, zipcode: number, password:string,lines:[], balance: number, phoneBal: number) {
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.lines = lines;
        this.password = password;
        this.balance = balance;
        this.phoneBal = phoneBal;
    }
}
