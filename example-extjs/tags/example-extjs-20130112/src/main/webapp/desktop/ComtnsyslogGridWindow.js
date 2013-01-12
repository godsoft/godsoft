/*!
 * Ext JS Library 4.0
 * Copyright(c) 2006-2011 Sencha Inc.
 * licensing@sencha.com
 * http://www.sencha.com/license
 */

Ext
        .define(
                'MyDesktop.ComtnsyslogGridWindow',
                {
                    extend : 'Ext.ux.desktop.Module',

                    requires : [ 'Ext.data.ArrayStore', 'Ext.util.Format',
                            'Ext.grid.Panel', 'Ext.grid.RowNumberer' ],

                    id : 'grid-win-comtnsyslog',

                    init : function() {
                        this.launcher = {
                            text : 'Comtnsyslog Grid Window',
                            iconCls : 'icon-grid'
                        };
                    },

                    createWindow : function() {
                        var desktop = this.app.getDesktop();
                        var win = desktop.getWindow('grid-win-comtnsyslog');
                        if (!win) {

                            Ext.define('User', {
                                extend : 'Ext.data.Model',
                                fields : [


                                {
                                    name : 'requstId',
                                    type : 'string'
                                },


                                {
                                    name : 'jobSeCode',
                                    type : 'string'
                                },


                                {
                                    name : 'insttCode',
                                    type : 'string'
                                },


                                {
                                    name : 'occrrncDe',
                                    type : 'string'
                                },


                                {
                                    name : 'rqesterIp',
                                    type : 'string'
                                },


                                {
                                    name : 'rqesterId',
                                    type : 'string'
                                },


                                {
                                    name : 'trgetMenuNm',
                                    type : 'string'
                                },


                                {
                                    name : 'svcNm',
                                    type : 'string'
                                },


                                {
                                    name : 'methodNm',
                                    type : 'string'
                                },


                                {
                                    name : 'processSeCode',
                                    type : 'string'
                                },


                                {
                                    name : 'processCo',
                                    type : 'string'
                                },


                                {
                                    name : 'processTime',
                                    type : 'string'
                                },


                                {
                                    name : 'rspnsCode',
                                    type : 'string'
                                },


                                {
                                    name : 'errorSe',
                                    type : 'string'
                                },


                                {
                                    name : 'errorCo',
                                    type : 'string'
                                },


                                {
                                    name : 'errorCode',
                                    type : 'string'
                                },


                                ]
                            });

                            var myStore = Ext
                                    .create(
                                            'Ext.data.Store',
                                            {
                                                model : 'User',
                                                proxy : {
                                                    type : 'ajax',
                                                    url : '/example-extjs/comtnsyslog/selectComtnsyslogListJson.do',
                                                    reader : {
                                                        type : 'json',
                                                        root : 'resultList'
                                                    }
                                                },
                                                autoLoad : true
                                            });

                            win = desktop.createWindow({
                                id : 'grid-win-comtnsyslog',
                                title : 'Comtnsyslog Grid Window',
                                width : 740,
                                height : 480,
                                iconCls : 'icon-grid',
                                animCollapse : false,
                                constrainHeader : true,
                                layout : 'fit',
                                items : [ {
                                    border : false,
                                    xtype : 'grid',
                                    // store : new Ext.data.ArrayStore({
                                    // fields : [ {
                                    // name : 'company'
                                    // }, {
                                    // name : 'price',
                                    // type : 'float'
                                    // }, {
                                    // name : 'change',
                                    // type : 'float'
                                    // }, {
                                    // name : 'pctChange',
                                    // type : 'float'
                                    // } ],
                                    // data :
                                    // MyDesktop.GridWindow.getDummyData()
                                    // }),
                                    store : myStore,
                                    columns : [ new Ext.grid.RowNumberer(),


                                    {
                                        text : "requstId",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'requstId'
                                    },


                                    {
                                        text : "jobSeCode",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'jobSeCode'
                                    },


                                    {
                                        text : "insttCode",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'insttCode'
                                    },


                                    {
                                        text : "occrrncDe",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'occrrncDe'
                                    },


                                    {
                                        text : "rqesterIp",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'rqesterIp'
                                    },


                                    {
                                        text : "rqesterId",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'rqesterId'
                                    },


                                    {
                                        text : "trgetMenuNm",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'trgetMenuNm'
                                    },


                                    {
                                        text : "svcNm",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'svcNm'
                                    },


                                    {
                                        text : "methodNm",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'methodNm'
                                    },


                                    {
                                        text : "processSeCode",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'processSeCode'
                                    },


                                    {
                                        text : "processCo",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'processCo'
                                    },


                                    {
                                        text : "processTime",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'processTime'
                                    },


                                    {
                                        text : "rspnsCode",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'rspnsCode'
                                    },


                                    {
                                        text : "errorSe",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'errorSe'
                                    },


                                    {
                                        text : "errorCo",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'errorCo'
                                    },


                                    {
                                        text : "errorCode",
//                                        width : 70,
                                        sortable : true,
//                                        renderer : Ext.util.Format.usMoney,
                                        dataIndex : 'errorCode'
                                    },

                                    ]
                                } ],
                                tbar : [ {
                                    text : 'Add Something',
                                    tooltip : 'Add a new row',
                                    iconCls : 'add'
                                }, '-', {
                                    text : 'Options',
                                    tooltip : 'Modify options',
                                    iconCls : 'option'
                                }, '-', {
                                    text : 'Remove Something',
                                    tooltip : 'Remove the selected item',
                                    iconCls : 'remove'
                                } ]
                            });
                        }
                        return win;
                    },

                    statics : {
                        getDummyData : function() {
                            return [
                                    // ['3m Co',71.72,0.02,0.03,'9/1 12:00am'],
                                    // ['Alcoa Inc',29.01,0.42,1.47,'9/1
                                    // 12:00am'],
                                    // ['American Express
                                    // Company',52.55,0.01,0.02,'9/1
                                    // 12:00am'],
                                    // ['American International Group,
                                    // Inc.',64.13,0.31,0.49,'9/1 12:00am'],
                                    // ['AT&T Inc.',31.61,-0.48,-1.54,'9/1
                                    // 12:00am'],
                                    // ['Caterpillar Inc.',67.27,0.92,1.39,'9/1
                                    // 12:00am'],
                                    // ['Citigroup, Inc.',49.37,0.02,0.04,'9/1
                                    // 12:00am'],
                                    // ['Exxon Mobil Corp',68.1,-0.43,-0.64,'9/1
                                    // 12:00am'],
                                    // ['General Electric
                                    // Company',34.14,-0.08,-0.23,'9/1
                                    // 12:00am'],
                                    // ['General Motors
                                    // Corporation',30.27,1.09,3.74,'9/1
                                    // 12:00am'],
                                    // ['Hewlett-Packard
                                    // Co.',36.53,-0.03,-0.08,'9/1
                                    // 12:00am'],
                                    // ['Honeywell Intl
                                    // Inc',38.77,0.05,0.13,'9/1
                                    // 12:00am'],
                                    // ['Intel Corporation',19.88,0.31,1.58,'9/1
                                    // 12:00am'],
                                    // ['Johnson & Johnson',64.72,0.06,0.09,'9/1
                                    // 12:00am'],
                                    // ['Merck & Co., Inc.',40.96,0.41,1.01,'9/1
                                    // 12:00am'],
                                    // ['Microsoft
                                    // Corporation',25.84,0.14,0.54,'9/1
                                    // 12:00am'],
                                    // ['The Coca-Cola
                                    // Company',45.07,0.26,0.58,'9/1
                                    // 12:00am'],
                                    // ['The Procter & Gamble
                                    // Company',61.91,0.01,0.02,'9/1 12:00am'],
                                    [ 'Wal-Mart Stores, Inc.', 45.45, 0.73,
                                            1.63, '9/1 12:00am' ],
                                    [
                                            'Walt Disney Company (The) (Holding Company)',
                                            29.89, 0.24, 0.81, '9/1 12:00am' ] ];
                        }
                    }
                });
