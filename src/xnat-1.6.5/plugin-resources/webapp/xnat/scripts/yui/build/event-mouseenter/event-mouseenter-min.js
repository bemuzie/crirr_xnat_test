/*
 * D:/Development/XNAT/1.6/xnat_builder_1_6dev/plugin-resources/webapp/xnat/scripts/yui/build/event-mouseenter/event-mouseenter-min.js
 * XNAT http://www.xnat.org
 * Copyright (c) 2014, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 *
 * Last modified 7/1/13 9:12 AM
 */
(function(){var B=YAHOO.util.Event,G=YAHOO.lang,E=B.addListener,F=B.removeListener,C=B.getListeners,D=[],H={mouseenter:"mouseover",mouseleave:"mouseout"},A=function(N,M,L){var J=B._getCacheIndex(D,N,M,L),I,K;if(J>=0){I=D[J];}if(N&&I){K=F.call(B,I[0],M,I[3]);if(K){delete D[J][2];delete D[J][3];D.splice(J,1);}}return K;};G.augmentObject(B._specialTypes,H);G.augmentObject(B,{_createMouseDelegate:function(I,J,K){return function(Q,M){var P=this,L=B.getRelatedTarget(Q),O,N;if(P!=L&&!YAHOO.util.Dom.isAncestor(P,L)){O=P;if(K){if(K===true){O=J;}else{O=K;}}N=[Q,P,J];if(M){N.splice(2,0,M);}return I.apply(O,N);}};},addListener:function(M,L,K,N,O){var I,J;if(H[L]){I=B._createMouseDelegate(K,N,O);I.mouseDelegate=true;D.push([M,L,K,I]);J=E.call(B,M,L,I);}else{J=E.apply(B,arguments);}return J;},removeListener:function(L,K,J){var I;if(H[K]){I=A.apply(B,arguments);}else{I=F.apply(B,arguments);}return I;},getListeners:function(N,M){var L=[],P,K=(M==="mouseover"||M==="mouseout"),O,J,I;if(M&&(K||H[M])){P=C.call(B,N,this._getType(M));if(P){for(J=P.length-1;J>-1;J--){I=P[J];O=I.fn.mouseDelegate;if((H[M]&&O)||(K&&!O)){L.push(I);}}}}else{L=C.apply(B,arguments);}return(L&&L.length)?L:null;}},true);B.on=B.addListener;}());YAHOO.register("event-mouseenter",YAHOO.util.Event,{version:"2.8.0r4",build:"2449"});