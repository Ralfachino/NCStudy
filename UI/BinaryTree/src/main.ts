import * as readlineSync from "readline-sync";
import { MyBinaryTreeB, MyNode} from "./binary-tree";

let rootData: string;
let tree: MyBinaryTreeB<number>;
const actions = ["Insert", "Find Node", "Find Parent Node", "Find Child", "Delete Node"];

let index: number;
do {
    index = readlineSync.keyInSelect(actions, "Choose");
    switch (index) {
        case 0: insert();
        break;

        case 1: findNode();
        break;
    }
} while (index !== -1);

function insert(): void {
    if (rootData) {
        rootData = readlineSync.question("Enter root data:" , {
            defaultInput: "10"
        });
        tree.insertMyNode()
    }

}

function findNode(): void {

}



