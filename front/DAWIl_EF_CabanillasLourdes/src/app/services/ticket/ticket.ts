import { User } from "../user/user";
import { Category } from "./category";
import { Kind } from "./kind";
import { Priority } from "./priority";
import { Project } from "./project";
import { Status } from "./status";

export interface Ticket {
    id:number;
    title:string;
    description:string;
    kind: Kind;
    user: User;
    project:Project;
    category:Category;
    priority:Priority;
    status:Status;
}