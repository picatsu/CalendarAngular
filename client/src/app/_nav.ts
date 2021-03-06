import { INavData } from "@coreui/angular";

export const navItems: INavData[] = [
  {
    name: "Dashboard",
    url: "/dashboard",
    icon: "icon-speedometer",
    badge: {
      variant: "info",
      text: "NEW"
    }
  },

  {
    title: true,
    name: "Components"
  },
  {
    name: "Operations",
    url: "/dbcomponents",
    icon: "icon-puzzle",
    children: [
      {
        name: "Post",
        url: "/dbcomponents/post",
        icon: "icon-puzzle"
      },

      {
        name: "Get",
        url: "/dbcomponents/get",
        icon: "icon-puzzle"
      },

      {
        name: "Update",
        url: "/dbcomponents/update",
        icon: "icon-puzzle"
      },
      {
        name: "Delete",
        url: "/dbcomponents/delete",
        icon: "icon-puzzle"
      }
    ]
  },

  {
    name: "Charts & Reporting",
    url: "/charts",
    icon: "icon-pie-chart"
  }
];
