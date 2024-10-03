export default function Header(){
    return(
        <div className="w-full min-h-full flex justify-between bg-transparent">
            <div className="px-10 h-full flex items-center hover:cursor-pointer">PARBULITOS LOGO</div>
            <div className="flex h-full items-center px-5">
                <div className="w-36 h-full flex justify-center items-center px-3">SOBRE MI</div>
                <div className="w-36 h-full flex justify-center items-center px-3">PROYECTOS</div>
                <div className="w-36 h-full flex justify-center items-center px-3">TECNOLOGIAS</div>
                <div className="w-36 h-full flex justify-center items-center px-3">CONTACTO</div>
            </div>
        </div>
    )
}