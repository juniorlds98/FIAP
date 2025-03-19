import { Icon } from "@iconify/react";
import{useState} from "react";
import 'virtual:windi.css'

export default function CaraCoroa(){
    const [texto, setTexto] = useState("Cara")

    function mudaCaraCoroa(){
        if (texto == "Coroa"){
            setTexto("Cara")
        }else{setTexto("Coroa")
        }
    }
    return(
        <>
            <span onClick={mudaCaraCoroa} className="px-1 bg-gray-800 rounded text-white cursor-pointer">
                {texto}
            </span>
            {texto == "Cara" ? <Icon icon = "tabler:coin" className="ml-2"/>: <Icon icon = "tabler:coin-filled" />}
            
        </>
    )
}