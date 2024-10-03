import type { Metadata } from "next";
import "./globals.css";
import Header from "@/app/components/header";

export const metadata: Metadata = {
  title: "Create Next App",
  description: "Generated by create next app",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body
        className="w-full min-h-screen h-screen flex flex-col bg-[url('public/mainBackground.png')] bg-cover backdrop-blur-lg bg-fixed"
      >
      <div className="w-full min-h-16 flex sticky top-0 z-10">
          <Header/>
      </div>
        {children}
      </body>
    </html>
  );
}