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
    url: "/couchdb",
    icon: "icon-puzzle",
    children: [
      {
        name: "Post",
        url: "/couchdb/forms",
        icon: "icon-puzzle"
      },

      {
        name: "Get",
        url: "/couchdb/switches",
        icon: "icon-puzzle"
      },

      {
        name: "Update",
        url: "/couchdb/tabs",
        icon: "icon-puzzle"
      },
      {
        name: "Delete",
        url: "/couchdb/tooltips",
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
