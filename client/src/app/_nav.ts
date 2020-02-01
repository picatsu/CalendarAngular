import { INavData } from '@coreui/angular';

export const navItems: INavData[] = [
  {
    name: 'Dashboard',
    url: '/dashboard',
    icon: 'icon-speedometer',
    badge: {
      variant: 'info',
      text: 'NEW'
    }
  },

  {
    title: true,
    name: 'Components'
  },
  {
    name: 'CouchDB',
    url: '/couchdb',
    icon: 'icon-puzzle',
    children: [
      {
        name: 'Cards',
        url: '/couchdb/cards',
        icon: 'icon-puzzle'
      },
      {
        name: 'Carousels',
        url: '/couchdb/carousels',
        icon: 'icon-puzzle'
      },
      {
        name: 'Collapses',
        url: '/couchdb/collapses',
        icon: 'icon-puzzle'
      },
      {
        name: 'Forms',
        url: '/couchdb/forms',
        icon: 'icon-puzzle'
      },
      {
        name: 'Navbars',
        url: '/couchdb/navbars',
        icon: 'icon-puzzle'

      },
      {
        name: 'Pagination',
        url: '/couchdb/paginations',
        icon: 'icon-puzzle'
      },
      {
        name: 'Popovers',
        url: '/couchdb/popovers',
        icon: 'icon-puzzle'
      },
      {
        name: 'Progress',
        url: '/couchdb/progress',
        icon: 'icon-puzzle'
      },
      {
        name: 'Switches',
        url: '/couchdb/switches',
        icon: 'icon-puzzle'
      },
      {
        name: 'Tables',
        url: '/couchdb/tables',
        icon: 'icon-puzzle'
      },
      {
        name: 'Tabs',
        url: '/couchdb/tabs',
        icon: 'icon-puzzle'
      },
      {
        name: 'Tooltips',
        url: '/couchdb/tooltips',
        icon: 'icon-puzzle'
      }
    ]
  },
  {
    name: 'Cassandra',
    url: '/cassandra',
    icon: 'icon-cursor',
    children: [
      {
        name: 'cassandra',
        url: '/cassandra/cassandra',
        icon: 'icon-cursor'
      },
      {
        name: 'Dropdowns',
        url: '/cassandra/dropdowns',
        icon: 'icon-cursor'
      },
      {
        name: 'Brand Buttons',
        url: '/cassandra/brand-buttons',
        icon: 'icon-cursor'
      }
    ]
  },
  {
    name: 'Charts',
    url: '/charts',
    icon: 'icon-pie-chart'
  },
  {
    name: 'MongoDB',
    url: '/mongodb',
    icon: 'icon-star',
    children: [
      {
        name: 'CoreUI Icons',
        url: '/mongodb/coreui-icons',
        icon: 'icon-star',
        badge: {
          variant: 'success',
          text: 'NEW'
        }
      },
      {
        name: 'Flags',
        url: '/mongodb/flags',
        icon: 'icon-star'
      },
      {
        name: 'Font Awesome',
        url: '/mongodb/font-awesome',
        icon: 'icon-star',
        badge: {
          variant: 'secondary',
          text: '4.7'
        }
      },
      {
        name: 'Simple Line Icons',
        url: '/mongodb/simple-line-icons',
        icon: 'icon-star'
      }
    ]
  },
  {
    name: 'Voldemort',
    url: '/voldemort',
    icon: 'icon-bell',
    children: [
      {
        name: 'Alerts',
        url: '/voldemort/alerts',
        icon: 'icon-bell'
      },
      {
        name: 'Badges',
        url: '/voldemort/badges',
        icon: 'icon-bell'
      },
      {
        name: 'Modals',
        url: '/voldemort/modals',
        icon: 'icon-bell'
      }
    ]
  },
  {
    name: 'Firebase',
    url: '/widgets',
    icon: 'icon-calculator',
    badge: {
      variant: 'info',
      text: 'NEW'
    }
  }
];
