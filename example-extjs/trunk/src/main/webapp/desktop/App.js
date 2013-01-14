/*!
 * Ext JS Library 4.0
 * Copyright(c) 2006-2011 Sencha Inc.
 * licensing@sencha.com
 * http://www.sencha.com/license
 */

Ext.define('MyDesktop.App', {
    extend: 'Ext.ux.desktop.App',

    requires: [
        'Ext.window.MessageBox',

        'Ext.ux.desktop.ShortcutModel',

        'MyDesktop.SystemStatus',
        'MyDesktop.VideoWindow',
        'MyDesktop.GridWindow',
//
'MyDesktop.ComtccmmncodeGridWindow',
'MyDesktop.ComtccmmndetailcodeGridWindow',
'MyDesktop.ComtnauthorinfoGridWindow',
'MyDesktop.ComtnmenuinfoGridWindow',
'MyDesktop.ComtnprogrmlistGridWindow',
'MyDesktop.ComtnroleinfoGridWindow',
'MyDesktop.ComtnsyslogGridWindow',
'MyDesktop.ComtnuserlogGridWindow',
'MyDesktop.ComtnweblogGridWindow',
'MyDesktop.ComtssyslogsummaryGridWindow',
'MyDesktop.ComtsusersummaryGridWindow',
'MyDesktop.ComtsweblogsummaryGridWindow',

//
        'MyDesktop.TabWindow',
        'MyDesktop.AccordionWindow',
        'MyDesktop.Notepad',
        'MyDesktop.BogusMenuModule',
        'MyDesktop.BogusModule',

//        'MyDesktop.Blockalanche',
        'MyDesktop.Settings'
    ],

    init: function() {
        // custom logic before getXYZ methods get called...

        this.callParent();

        // now ready...
    },

    getModules : function(){
        return [
            new MyDesktop.VideoWindow(),
            //new MyDesktop.Blockalanche(),
            new MyDesktop.SystemStatus(),
            new MyDesktop.GridWindow(),
//
new MyDesktop.ComtccmmncodeGridWindow(),
new MyDesktop.ComtccmmndetailcodeGridWindow(),
new MyDesktop.ComtnauthorinfoGridWindow(),
new MyDesktop.ComtnmenuinfoGridWindow(),
new MyDesktop.ComtnprogrmlistGridWindow(),
new MyDesktop.ComtnroleinfoGridWindow(),
new MyDesktop.ComtnsyslogGridWindow(),
new MyDesktop.ComtnuserlogGridWindow(),
new MyDesktop.ComtnweblogGridWindow(),
new MyDesktop.ComtssyslogsummaryGridWindow(),
new MyDesktop.ComtsusersummaryGridWindow(),
new MyDesktop.ComtsweblogsummaryGridWindow(),

//
            new MyDesktop.TabWindow(),
            new MyDesktop.AccordionWindow(),
            new MyDesktop.Notepad(),
            new MyDesktop.BogusMenuModule(),
            new MyDesktop.BogusModule()
        ];
    },

    getDesktopConfig: function () {
        var me = this, ret = me.callParent();

        return Ext.apply(ret, {
            //cls: 'ux-desktop-black',

            contextMenuItems: [
                { text: 'Change Settings', handler: me.onSettings, scope: me }
            ],

            shortcuts: Ext.create('Ext.data.Store', {
                model: 'Ext.ux.desktop.ShortcutModel',
                data: [
                    { name: '샘플 Grid Window', iconCls: 'grid-shortcut', module: 'grid-win' },
//
{ name: 'Comtccmmncode Grid Window', iconCls: 'grid-shortcut', module: 'grid-win-comtccmmncode' },
{ name: 'Comtccmmndetailcode Grid Window', iconCls: 'grid-shortcut', module: 'grid-win-comtccmmndetailcode' },
{ name: 'Comtnauthorinfo Grid Window', iconCls: 'grid-shortcut', module: 'grid-win-comtnauthorinfo' },
{ name: 'Comtnmenuinfo Grid Window', iconCls: 'grid-shortcut', module: 'grid-win-comtnmenuinfo' },
{ name: 'Comtnprogrmlist Grid Window', iconCls: 'grid-shortcut', module: 'grid-win-comtnprogrmlist' },
{ name: 'Comtnroleinfo Grid Window', iconCls: 'grid-shortcut', module: 'grid-win-comtnroleinfo' },
{ name: 'Comtnsyslog Grid Window', iconCls: 'grid-shortcut', module: 'grid-win-comtnsyslog' },
{ name: 'Comtnuserlog Grid Window', iconCls: 'grid-shortcut', module: 'grid-win-comtnuserlog' },
{ name: 'Comtnweblog Grid Window', iconCls: 'grid-shortcut', module: 'grid-win-comtnweblog' },
{ name: 'Comtssyslogsummary Grid Window', iconCls: 'grid-shortcut', module: 'grid-win-comtssyslogsummary' },
{ name: 'Comtsusersummary Grid Window', iconCls: 'grid-shortcut', module: 'grid-win-comtsusersummary' },
{ name: 'Comtsweblogsummary Grid Window', iconCls: 'grid-shortcut', module: 'grid-win-comtsweblogsummary' },

//
                    { name: 'Accordion Window', iconCls: 'accordion-shortcut', module: 'acc-win' },
                    { name: 'Notepad', iconCls: 'notepad-shortcut', module: 'notepad' },
                    { name: 'System Status', iconCls: 'cpu-shortcut', module: 'systemstatus'}
                ]
            }),

            wallpaper: 'wallpapers/Blue-Sencha.jpg',
            wallpaperStretch: false
        });
    },

    // config for the start menu
    getStartConfig : function() {
        var me = this, ret = me.callParent();

        return Ext.apply(ret, {
            title: 'Don Griffin',
            iconCls: 'user',
            height: 600,
            toolConfig: {
                width: 100,
                items: [
                    {
                        text:'Settings',
                        iconCls:'settings',
                        handler: me.onSettings,
                        scope: me
                    },
                    '-',
                    {
                        text:'Logout',
                        iconCls:'logout',
                        handler: me.onLogout,
                        scope: me
                    }
                ]
            }
        });
    },

    getTaskbarConfig: function () {
        var ret = this.callParent();

        return Ext.apply(ret, {
            quickStart: [
                { name: 'Accordion Window', iconCls: 'accordion', module: 'acc-win' },
                { name: '샘플 Grid Window', iconCls: 'icon-grid', module: 'grid-win' }
            ],
            trayItems: [
                { xtype: 'trayclock', flex: 1 }
            ]
        });
    },

    onLogout: function () {
        Ext.Msg.confirm('Logout', 'Are you sure you want to logout?');
    },

    onSettings: function () {
        var dlg = new MyDesktop.Settings({
            desktop: this.desktop
        });
        dlg.show();
    }
});
