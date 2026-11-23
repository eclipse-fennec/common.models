/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_AdministrativeDistance;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Administrative Distance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getDirectConnect <em>Direct Connect</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getEBGP <em>EBGP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getEIGRPInternal <em>EIGRP Internal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getIGRP <em>IGRP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getOSPF <em>OSPF</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getISIS <em>ISIS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getRIP <em>RIP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getEGP <em>EGP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getEIGRPExternal <em>EIGRP External</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getIBGP <em>IBGP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getBGPLocal <em>BGP Local</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdministrativeDistanceImpl#getUnknown <em>Unknown</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AdministrativeDistanceImpl extends CIM_LogicalElementImpl implements CIM_AdministrativeDistance {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectConnect() <em>Direct Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectConnect()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIRECT_CONNECT_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getDirectConnect() <em>Direct Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectConnect()
	 * @generated
	 * @ordered
	 */
	protected Integer directConnect = DIRECT_CONNECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STATIC_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected Integer static_ = STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getEBGP() <em>EBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBGP()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EBGP_EDEFAULT = Integer.valueOf(20);

	/**
	 * The cached value of the '{@link #getEBGP() <em>EBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBGP()
	 * @generated
	 * @ordered
	 */
	protected Integer ebgp = EBGP_EDEFAULT;

	/**
	 * The default value of the '{@link #getEIGRPInternal() <em>EIGRP Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIGRPInternal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EIGRP_INTERNAL_EDEFAULT = Integer.valueOf(90);

	/**
	 * The cached value of the '{@link #getEIGRPInternal() <em>EIGRP Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIGRPInternal()
	 * @generated
	 * @ordered
	 */
	protected Integer eigrpInternal = EIGRP_INTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIGRP() <em>IGRP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIGRP()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IGRP_EDEFAULT = Integer.valueOf(100);

	/**
	 * The cached value of the '{@link #getIGRP() <em>IGRP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIGRP()
	 * @generated
	 * @ordered
	 */
	protected Integer igrp = IGRP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOSPF() <em>OSPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSPF()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OSPF_EDEFAULT = Integer.valueOf(110);

	/**
	 * The cached value of the '{@link #getOSPF() <em>OSPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSPF()
	 * @generated
	 * @ordered
	 */
	protected Integer ospf = OSPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getISIS() <em>ISIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISIS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ISIS_EDEFAULT = Integer.valueOf(115);

	/**
	 * The cached value of the '{@link #getISIS() <em>ISIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISIS()
	 * @generated
	 * @ordered
	 */
	protected Integer isis = ISIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRIP() <em>RIP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRIP()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RIP_EDEFAULT = Integer.valueOf(120);

	/**
	 * The cached value of the '{@link #getRIP() <em>RIP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRIP()
	 * @generated
	 * @ordered
	 */
	protected Integer rip = RIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getEGP() <em>EGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGP()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EGP_EDEFAULT = Integer.valueOf(140);

	/**
	 * The cached value of the '{@link #getEGP() <em>EGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGP()
	 * @generated
	 * @ordered
	 */
	protected Integer egp = EGP_EDEFAULT;

	/**
	 * The default value of the '{@link #getEIGRPExternal() <em>EIGRP External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIGRPExternal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EIGRP_EXTERNAL_EDEFAULT = Integer.valueOf(170);

	/**
	 * The cached value of the '{@link #getEIGRPExternal() <em>EIGRP External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIGRPExternal()
	 * @generated
	 * @ordered
	 */
	protected Integer eigrpExternal = EIGRP_EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIBGP() <em>IBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBGP()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IBGP_EDEFAULT = Integer.valueOf(200);

	/**
	 * The cached value of the '{@link #getIBGP() <em>IBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBGP()
	 * @generated
	 * @ordered
	 */
	protected Integer ibgp = IBGP_EDEFAULT;

	/**
	 * The default value of the '{@link #getBGPLocal() <em>BGP Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPLocal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BGP_LOCAL_EDEFAULT = Integer.valueOf(200);

	/**
	 * The cached value of the '{@link #getBGPLocal() <em>BGP Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPLocal()
	 * @generated
	 * @ordered
	 */
	protected Integer bgpLocal = BGP_LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnknown() <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknown()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UNKNOWN_EDEFAULT = Integer.valueOf(255);

	/**
	 * The cached value of the '{@link #getUnknown() <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknown()
	 * @generated
	 * @ordered
	 */
	protected Integer unknown = UNKNOWN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AdministrativeDistanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AdministrativeDistance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDirectConnect() {
		return directConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectConnect(Integer newDirectConnect) {
		Integer oldDirectConnect = directConnect;
		directConnect = newDirectConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__DIRECT_CONNECT, oldDirectConnect, directConnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatic(Integer newStatic) {
		Integer oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEBGP() {
		return ebgp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEBGP(Integer newEBGP) {
		Integer oldEBGP = ebgp;
		ebgp = newEBGP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EBGP, oldEBGP, ebgp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEIGRPInternal() {
		return eigrpInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEIGRPInternal(Integer newEIGRPInternal) {
		Integer oldEIGRPInternal = eigrpInternal;
		eigrpInternal = newEIGRPInternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EIGRP_INTERNAL, oldEIGRPInternal, eigrpInternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIGRP() {
		return igrp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIGRP(Integer newIGRP) {
		Integer oldIGRP = igrp;
		igrp = newIGRP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__IGRP, oldIGRP, igrp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOSPF() {
		return ospf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOSPF(Integer newOSPF) {
		Integer oldOSPF = ospf;
		ospf = newOSPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__OSPF, oldOSPF, ospf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getISIS() {
		return isis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setISIS(Integer newISIS) {
		Integer oldISIS = isis;
		isis = newISIS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__ISIS, oldISIS, isis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRIP() {
		return rip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRIP(Integer newRIP) {
		Integer oldRIP = rip;
		rip = newRIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__RIP, oldRIP, rip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEGP() {
		return egp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEGP(Integer newEGP) {
		Integer oldEGP = egp;
		egp = newEGP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EGP, oldEGP, egp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEIGRPExternal() {
		return eigrpExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEIGRPExternal(Integer newEIGRPExternal) {
		Integer oldEIGRPExternal = eigrpExternal;
		eigrpExternal = newEIGRPExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EIGRP_EXTERNAL, oldEIGRPExternal, eigrpExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIBGP() {
		return ibgp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIBGP(Integer newIBGP) {
		Integer oldIBGP = ibgp;
		ibgp = newIBGP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__IBGP, oldIBGP, ibgp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBGPLocal() {
		return bgpLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBGPLocal(Integer newBGPLocal) {
		Integer oldBGPLocal = bgpLocal;
		bgpLocal = newBGPLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__BGP_LOCAL, oldBGPLocal, bgpLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUnknown() {
		return unknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknown(Integer newUnknown) {
		Integer oldUnknown = unknown;
		unknown = newUnknown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADMINISTRATIVE_DISTANCE__UNKNOWN, oldUnknown, unknown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__DIRECT_CONNECT:
				return getDirectConnect();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__STATIC:
				return getStatic();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EBGP:
				return getEBGP();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EIGRP_INTERNAL:
				return getEIGRPInternal();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__IGRP:
				return getIGRP();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__OSPF:
				return getOSPF();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__ISIS:
				return getISIS();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__RIP:
				return getRIP();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EGP:
				return getEGP();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EIGRP_EXTERNAL:
				return getEIGRPExternal();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__IBGP:
				return getIBGP();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__BGP_LOCAL:
				return getBGPLocal();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__UNKNOWN:
				return getUnknown();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__DIRECT_CONNECT:
				setDirectConnect((Integer)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__STATIC:
				setStatic((Integer)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EBGP:
				setEBGP((Integer)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EIGRP_INTERNAL:
				setEIGRPInternal((Integer)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__IGRP:
				setIGRP((Integer)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__OSPF:
				setOSPF((Integer)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__ISIS:
				setISIS((Integer)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__RIP:
				setRIP((Integer)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EGP:
				setEGP((Integer)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EIGRP_EXTERNAL:
				setEIGRPExternal((Integer)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__IBGP:
				setIBGP((Integer)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__BGP_LOCAL:
				setBGPLocal((Integer)newValue);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__UNKNOWN:
				setUnknown((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__DIRECT_CONNECT:
				setDirectConnect(DIRECT_CONNECT_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EBGP:
				setEBGP(EBGP_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EIGRP_INTERNAL:
				setEIGRPInternal(EIGRP_INTERNAL_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__IGRP:
				setIGRP(IGRP_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__OSPF:
				setOSPF(OSPF_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__ISIS:
				setISIS(ISIS_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__RIP:
				setRIP(RIP_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EGP:
				setEGP(EGP_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EIGRP_EXTERNAL:
				setEIGRPExternal(EIGRP_EXTERNAL_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__IBGP:
				setIBGP(IBGP_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__BGP_LOCAL:
				setBGPLocal(BGP_LOCAL_EDEFAULT);
				return;
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__UNKNOWN:
				setUnknown(UNKNOWN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__DIRECT_CONNECT:
				return DIRECT_CONNECT_EDEFAULT == null ? directConnect != null : !DIRECT_CONNECT_EDEFAULT.equals(directConnect);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__STATIC:
				return STATIC_EDEFAULT == null ? static_ != null : !STATIC_EDEFAULT.equals(static_);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EBGP:
				return EBGP_EDEFAULT == null ? ebgp != null : !EBGP_EDEFAULT.equals(ebgp);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EIGRP_INTERNAL:
				return EIGRP_INTERNAL_EDEFAULT == null ? eigrpInternal != null : !EIGRP_INTERNAL_EDEFAULT.equals(eigrpInternal);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__IGRP:
				return IGRP_EDEFAULT == null ? igrp != null : !IGRP_EDEFAULT.equals(igrp);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__OSPF:
				return OSPF_EDEFAULT == null ? ospf != null : !OSPF_EDEFAULT.equals(ospf);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__ISIS:
				return ISIS_EDEFAULT == null ? isis != null : !ISIS_EDEFAULT.equals(isis);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__RIP:
				return RIP_EDEFAULT == null ? rip != null : !RIP_EDEFAULT.equals(rip);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EGP:
				return EGP_EDEFAULT == null ? egp != null : !EGP_EDEFAULT.equals(egp);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__EIGRP_EXTERNAL:
				return EIGRP_EXTERNAL_EDEFAULT == null ? eigrpExternal != null : !EIGRP_EXTERNAL_EDEFAULT.equals(eigrpExternal);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__IBGP:
				return IBGP_EDEFAULT == null ? ibgp != null : !IBGP_EDEFAULT.equals(ibgp);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__BGP_LOCAL:
				return BGP_LOCAL_EDEFAULT == null ? bgpLocal != null : !BGP_LOCAL_EDEFAULT.equals(bgpLocal);
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE__UNKNOWN:
				return UNKNOWN_EDEFAULT == null ? unknown != null : !UNKNOWN_EDEFAULT.equals(unknown);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", DirectConnect: ");
		result.append(directConnect);
		result.append(", Static: ");
		result.append(static_);
		result.append(", EBGP: ");
		result.append(ebgp);
		result.append(", EIGRPInternal: ");
		result.append(eigrpInternal);
		result.append(", IGRP: ");
		result.append(igrp);
		result.append(", OSPF: ");
		result.append(ospf);
		result.append(", ISIS: ");
		result.append(isis);
		result.append(", RIP: ");
		result.append(rip);
		result.append(", EGP: ");
		result.append(egp);
		result.append(", EIGRPExternal: ");
		result.append(eigrpExternal);
		result.append(", IBGP: ");
		result.append(ibgp);
		result.append(", BGPLocal: ");
		result.append(bgpLocal);
		result.append(", Unknown: ");
		result.append(unknown);
		result.append(')');
		return result.toString();
	}

} //CIM_AdministrativeDistanceImpl
