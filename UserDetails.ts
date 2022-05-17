
import { Address } from "./Address";
import { Company } from "./Company";

export class UserDetails {
    id!: number;
    name!: string;
    username!:string;
    email!: string;
    address!:Address;
    phone!: string;
    website!: string;
    company!: Company;
}

