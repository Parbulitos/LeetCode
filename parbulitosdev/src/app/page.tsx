import SocialChip from "@/app/components/socialChip";
import DownArrow from "@/app/components/downArrow";

export default function Home() {

    return (
        <div className="w-full min-h-screen flex flex-col items-center overflow-scroll">
            <div className="landing-Section w-full min-h-[94%] flex flex-col items-center">
                <div className="w-[80%] h-full flex flex-col mt-44 gap-4 justify-between">
                    <div className="flex flex-col gap-6">
                        <div>
                            <div
                                className="p-3 text-8xl font-serif inline-block text-transparent bg-clip-text bg-[url('public/textBgGradient.png')]">
                                Front-End Developer
                            </div>
                            <div className="pl-4 p-3 text-4xl font-serif">Carlos Santiago Echavarne Ramones</div>
                        </div>
                        <div className="flex gap-4 p-3">
                            <SocialChip image={"github"} name={"Github"} url={"https://github.com/Parbulitos"}/>
                            <SocialChip image={"linkedin"} name={"Linkedin"}
                                        url={"https://www.linkedin.com/in/carlos-santiago-echavarne-ramones-22800a234/"}/>
                        </div>
                    </div>
                    <div className="w-full flex justify-center mb-12">
                        <DownArrow/>
                    </div>
                </div>
            </div>
            <div className="about-Me-Section w-full min-h-screen flex flex-col items-center">
                <div className="w-[80%] h-full flex flex-col items-center">
                    <div className="text-center text-6xl font-serif mt-24 bg-[url('public/textBgGradient.png')] inline-block p-3 text-transparent bg-clip-text">
                        Quien soy?
                    </div>
                </div>
            </div>
        </div>
    );
}
