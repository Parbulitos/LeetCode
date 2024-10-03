'use client'
import {useState} from "react";

export default function DownArrow() {
    const [hovered, setHovered] = useState(false);
    const stylesEllipse = hovered ? "fill-black" : ""
    const stylesArrow = hovered ? "stroke-white" : "stroke-black"
    return (
        <button
            onMouseEnter={()=>{setHovered(true)}}
            onMouseLeave={()=>{setHovered(false)}}
            onClick={()=>{alert('Scroll down!')}}
        >
            <svg width="369" height="35" viewBox="0 0 369 35" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path d="M6.98242 17H156.982M212 17H362" stroke="black" strokeWidth="3"/>
                <circle cx="183.5" cy="17.5" r="16.5" stroke="black" strokeWidth="2" className={`${stylesEllipse} transition duration-300`}/>
                <circle cx="4" cy="17" r="3.5" stroke="black"/>
                <circle cx="365" cy="17" r="3.5" stroke="black"/>
                <path d="M191.5 14.25L184 21.75L176.5 14.25" className={`${stylesArrow} transition duration-300 ]`} strokeWidth="1.5" strokeLinecap="round"
                      strokeLinejoin="round"/>
            </svg>
        </button>
    )
}