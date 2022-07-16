export class Account {
    
    email: string;
    phoneMe:number;
    firstName: string;
    lastName: string;
    addressMe: string;
    addressMe2: string;
    cityMe: string;
    stateMe: string;
    zipCodeMe: number;
    phones: [];

    constructor (email: string, phoneMe: number, firstName: string, lastName: string, addressMe: string, addressMe2: string, cityMe: string, stateMe: string, zipCodeMe: number, phones:[]) {
        this.email = email;
        this.phoneMe = phoneMe;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressMe = addressMe;
        this.addressMe2 = addressMe2;
        this.cityMe = cityMe;
        this.stateMe = stateMe;
        this.zipCodeMe = zipCodeMe;
        this.phones = phones;
    }
}