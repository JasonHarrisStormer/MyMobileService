export class User {
    email: string;
    password: string;
    enable: number;

    constructor (email: string, password:string) {
        
        this.email = email;
        this.password = password;
        this.enable = 1;


    }
}
