'use client'
import GithubIcon from "@/app/components/githubIcon";
import LinkedinIcon from "@/app/components/linkedinIcon";
import {useState} from "react";

export default function SocialChip({image, name, url}: { image: string, name: string, url: string }) {
    const [hovered, setHovered] = useState(false);
    const styles = hovered ? "bg-black text-white shadow-xl" : ""
    return (
        <button
            onMouseEnter={() => {
                setHovered(true)
            }}
            onMouseLeave={() => {
                setHovered(false)
            }}
            className={`flex min-w-fit w-44 items-center gap-4 border-[2px] border-black rounded-full p-2 ${styles} transition duration-300`}
            onClick={() => {
                window.open(url, '_blank');
            }}>

            {image == 'github' ?
                <div>{GithubIcon()}</div>
                :
                (image == 'linkedin' ?
                        <div>{LinkedinIcon()}</div>
                        :
                        <div>Nothing to show</div>
                )
            }
            <div className="text-2xl">{name}</div>
        </button>
    )
}