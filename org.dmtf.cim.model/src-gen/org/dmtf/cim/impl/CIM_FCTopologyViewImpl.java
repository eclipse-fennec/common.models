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

import org.dmtf.cim.CIM_FCTopologyView;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FC Topology View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCTopologyViewImpl#getAntecedentFCPort <em>Antecedent FC Port</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCTopologyViewImpl#getAntecedentSystem <em>Antecedent System</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCTopologyViewImpl#getAntecedentFCPortWWN <em>Antecedent FC Port WWN</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCTopologyViewImpl#getAntecedentFCPortElementName <em>Antecedent FC Port Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCTopologyViewImpl#getAntecedentElementWWN <em>Antecedent Element WWN</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCTopologyViewImpl#getAntecedentFCPortType <em>Antecedent FC Port Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCTopologyViewImpl#getDependentFCPort <em>Dependent FC Port</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCTopologyViewImpl#getDependentSystem <em>Dependent System</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCTopologyViewImpl#getDependentFCPortWWN <em>Dependent FC Port WWN</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCTopologyViewImpl#getDependentFCPortElementName <em>Dependent FC Port Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCTopologyViewImpl#getDependentElementWWN <em>Dependent Element WWN</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCTopologyViewImpl#getDependentFCPortType <em>Dependent FC Port Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FCTopologyViewImpl extends CIM_ViewImpl implements CIM_FCTopologyView {
	/**
	 * The default value of the '{@link #getAntecedentFCPort() <em>Antecedent FC Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentFCPort()
	 * @generated
	 * @ordered
	 */
	protected static final String ANTECEDENT_FC_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAntecedentFCPort() <em>Antecedent FC Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentFCPort()
	 * @generated
	 * @ordered
	 */
	protected String antecedentFCPort = ANTECEDENT_FC_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAntecedentSystem() <em>Antecedent System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String ANTECEDENT_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAntecedentSystem() <em>Antecedent System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentSystem()
	 * @generated
	 * @ordered
	 */
	protected String antecedentSystem = ANTECEDENT_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAntecedentFCPortWWN() <em>Antecedent FC Port WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentFCPortWWN()
	 * @generated
	 * @ordered
	 */
	protected static final String ANTECEDENT_FC_PORT_WWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAntecedentFCPortWWN() <em>Antecedent FC Port WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentFCPortWWN()
	 * @generated
	 * @ordered
	 */
	protected String antecedentFCPortWWN = ANTECEDENT_FC_PORT_WWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAntecedentFCPortElementName() <em>Antecedent FC Port Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentFCPortElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANTECEDENT_FC_PORT_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAntecedentFCPortElementName() <em>Antecedent FC Port Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentFCPortElementName()
	 * @generated
	 * @ordered
	 */
	protected String antecedentFCPortElementName = ANTECEDENT_FC_PORT_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAntecedentElementWWN() <em>Antecedent Element WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentElementWWN()
	 * @generated
	 * @ordered
	 */
	protected static final String ANTECEDENT_ELEMENT_WWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAntecedentElementWWN() <em>Antecedent Element WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentElementWWN()
	 * @generated
	 * @ordered
	 */
	protected String antecedentElementWWN = ANTECEDENT_ELEMENT_WWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAntecedentFCPortType() <em>Antecedent FC Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentFCPortType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ANTECEDENT_FC_PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAntecedentFCPortType() <em>Antecedent FC Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentFCPortType()
	 * @generated
	 * @ordered
	 */
	protected Integer antecedentFCPortType = ANTECEDENT_FC_PORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependentFCPort() <em>Dependent FC Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentFCPort()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENT_FC_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependentFCPort() <em>Dependent FC Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentFCPort()
	 * @generated
	 * @ordered
	 */
	protected String dependentFCPort = DEPENDENT_FC_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependentSystem() <em>Dependent System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENT_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependentSystem() <em>Dependent System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentSystem()
	 * @generated
	 * @ordered
	 */
	protected String dependentSystem = DEPENDENT_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependentFCPortWWN() <em>Dependent FC Port WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentFCPortWWN()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENT_FC_PORT_WWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependentFCPortWWN() <em>Dependent FC Port WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentFCPortWWN()
	 * @generated
	 * @ordered
	 */
	protected String dependentFCPortWWN = DEPENDENT_FC_PORT_WWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependentFCPortElementName() <em>Dependent FC Port Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentFCPortElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENT_FC_PORT_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependentFCPortElementName() <em>Dependent FC Port Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentFCPortElementName()
	 * @generated
	 * @ordered
	 */
	protected String dependentFCPortElementName = DEPENDENT_FC_PORT_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependentElementWWN() <em>Dependent Element WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentElementWWN()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENT_ELEMENT_WWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependentElementWWN() <em>Dependent Element WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentElementWWN()
	 * @generated
	 * @ordered
	 */
	protected String dependentElementWWN = DEPENDENT_ELEMENT_WWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependentFCPortType() <em>Dependent FC Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentFCPortType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEPENDENT_FC_PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependentFCPortType() <em>Dependent FC Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentFCPortType()
	 * @generated
	 * @ordered
	 */
	protected Integer dependentFCPortType = DEPENDENT_FC_PORT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FCTopologyViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FCTopologyView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAntecedentFCPort() {
		return antecedentFCPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntecedentFCPort(String newAntecedentFCPort) {
		String oldAntecedentFCPort = antecedentFCPort;
		antecedentFCPort = newAntecedentFCPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT, oldAntecedentFCPort, antecedentFCPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAntecedentSystem() {
		return antecedentSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntecedentSystem(String newAntecedentSystem) {
		String oldAntecedentSystem = antecedentSystem;
		antecedentSystem = newAntecedentSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_SYSTEM, oldAntecedentSystem, antecedentSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAntecedentFCPortWWN() {
		return antecedentFCPortWWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntecedentFCPortWWN(String newAntecedentFCPortWWN) {
		String oldAntecedentFCPortWWN = antecedentFCPortWWN;
		antecedentFCPortWWN = newAntecedentFCPortWWN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_WWN, oldAntecedentFCPortWWN, antecedentFCPortWWN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAntecedentFCPortElementName() {
		return antecedentFCPortElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntecedentFCPortElementName(String newAntecedentFCPortElementName) {
		String oldAntecedentFCPortElementName = antecedentFCPortElementName;
		antecedentFCPortElementName = newAntecedentFCPortElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_ELEMENT_NAME, oldAntecedentFCPortElementName, antecedentFCPortElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAntecedentElementWWN() {
		return antecedentElementWWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntecedentElementWWN(String newAntecedentElementWWN) {
		String oldAntecedentElementWWN = antecedentElementWWN;
		antecedentElementWWN = newAntecedentElementWWN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_ELEMENT_WWN, oldAntecedentElementWWN, antecedentElementWWN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAntecedentFCPortType() {
		return antecedentFCPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntecedentFCPortType(Integer newAntecedentFCPortType) {
		Integer oldAntecedentFCPortType = antecedentFCPortType;
		antecedentFCPortType = newAntecedentFCPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_TYPE, oldAntecedentFCPortType, antecedentFCPortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDependentFCPort() {
		return dependentFCPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependentFCPort(String newDependentFCPort) {
		String oldDependentFCPort = dependentFCPort;
		dependentFCPort = newDependentFCPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT, oldDependentFCPort, dependentFCPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDependentSystem() {
		return dependentSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependentSystem(String newDependentSystem) {
		String oldDependentSystem = dependentSystem;
		dependentSystem = newDependentSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_SYSTEM, oldDependentSystem, dependentSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDependentFCPortWWN() {
		return dependentFCPortWWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependentFCPortWWN(String newDependentFCPortWWN) {
		String oldDependentFCPortWWN = dependentFCPortWWN;
		dependentFCPortWWN = newDependentFCPortWWN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_WWN, oldDependentFCPortWWN, dependentFCPortWWN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDependentFCPortElementName() {
		return dependentFCPortElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependentFCPortElementName(String newDependentFCPortElementName) {
		String oldDependentFCPortElementName = dependentFCPortElementName;
		dependentFCPortElementName = newDependentFCPortElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_ELEMENT_NAME, oldDependentFCPortElementName, dependentFCPortElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDependentElementWWN() {
		return dependentElementWWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependentElementWWN(String newDependentElementWWN) {
		String oldDependentElementWWN = dependentElementWWN;
		dependentElementWWN = newDependentElementWWN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_ELEMENT_WWN, oldDependentElementWWN, dependentElementWWN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDependentFCPortType() {
		return dependentFCPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependentFCPortType(Integer newDependentFCPortType) {
		Integer oldDependentFCPortType = dependentFCPortType;
		dependentFCPortType = newDependentFCPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_TYPE, oldDependentFCPortType, dependentFCPortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT:
				return getAntecedentFCPort();
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_SYSTEM:
				return getAntecedentSystem();
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_WWN:
				return getAntecedentFCPortWWN();
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_ELEMENT_NAME:
				return getAntecedentFCPortElementName();
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_ELEMENT_WWN:
				return getAntecedentElementWWN();
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_TYPE:
				return getAntecedentFCPortType();
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT:
				return getDependentFCPort();
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_SYSTEM:
				return getDependentSystem();
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_WWN:
				return getDependentFCPortWWN();
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_ELEMENT_NAME:
				return getDependentFCPortElementName();
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_ELEMENT_WWN:
				return getDependentElementWWN();
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_TYPE:
				return getDependentFCPortType();
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
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT:
				setAntecedentFCPort((String)newValue);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_SYSTEM:
				setAntecedentSystem((String)newValue);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_WWN:
				setAntecedentFCPortWWN((String)newValue);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_ELEMENT_NAME:
				setAntecedentFCPortElementName((String)newValue);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_ELEMENT_WWN:
				setAntecedentElementWWN((String)newValue);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_TYPE:
				setAntecedentFCPortType((Integer)newValue);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT:
				setDependentFCPort((String)newValue);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_SYSTEM:
				setDependentSystem((String)newValue);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_WWN:
				setDependentFCPortWWN((String)newValue);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_ELEMENT_NAME:
				setDependentFCPortElementName((String)newValue);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_ELEMENT_WWN:
				setDependentElementWWN((String)newValue);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_TYPE:
				setDependentFCPortType((Integer)newValue);
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
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT:
				setAntecedentFCPort(ANTECEDENT_FC_PORT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_SYSTEM:
				setAntecedentSystem(ANTECEDENT_SYSTEM_EDEFAULT);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_WWN:
				setAntecedentFCPortWWN(ANTECEDENT_FC_PORT_WWN_EDEFAULT);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_ELEMENT_NAME:
				setAntecedentFCPortElementName(ANTECEDENT_FC_PORT_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_ELEMENT_WWN:
				setAntecedentElementWWN(ANTECEDENT_ELEMENT_WWN_EDEFAULT);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_TYPE:
				setAntecedentFCPortType(ANTECEDENT_FC_PORT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT:
				setDependentFCPort(DEPENDENT_FC_PORT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_SYSTEM:
				setDependentSystem(DEPENDENT_SYSTEM_EDEFAULT);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_WWN:
				setDependentFCPortWWN(DEPENDENT_FC_PORT_WWN_EDEFAULT);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_ELEMENT_NAME:
				setDependentFCPortElementName(DEPENDENT_FC_PORT_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_ELEMENT_WWN:
				setDependentElementWWN(DEPENDENT_ELEMENT_WWN_EDEFAULT);
				return;
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_TYPE:
				setDependentFCPortType(DEPENDENT_FC_PORT_TYPE_EDEFAULT);
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
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT:
				return ANTECEDENT_FC_PORT_EDEFAULT == null ? antecedentFCPort != null : !ANTECEDENT_FC_PORT_EDEFAULT.equals(antecedentFCPort);
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_SYSTEM:
				return ANTECEDENT_SYSTEM_EDEFAULT == null ? antecedentSystem != null : !ANTECEDENT_SYSTEM_EDEFAULT.equals(antecedentSystem);
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_WWN:
				return ANTECEDENT_FC_PORT_WWN_EDEFAULT == null ? antecedentFCPortWWN != null : !ANTECEDENT_FC_PORT_WWN_EDEFAULT.equals(antecedentFCPortWWN);
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_ELEMENT_NAME:
				return ANTECEDENT_FC_PORT_ELEMENT_NAME_EDEFAULT == null ? antecedentFCPortElementName != null : !ANTECEDENT_FC_PORT_ELEMENT_NAME_EDEFAULT.equals(antecedentFCPortElementName);
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_ELEMENT_WWN:
				return ANTECEDENT_ELEMENT_WWN_EDEFAULT == null ? antecedentElementWWN != null : !ANTECEDENT_ELEMENT_WWN_EDEFAULT.equals(antecedentElementWWN);
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__ANTECEDENT_FC_PORT_TYPE:
				return ANTECEDENT_FC_PORT_TYPE_EDEFAULT == null ? antecedentFCPortType != null : !ANTECEDENT_FC_PORT_TYPE_EDEFAULT.equals(antecedentFCPortType);
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT:
				return DEPENDENT_FC_PORT_EDEFAULT == null ? dependentFCPort != null : !DEPENDENT_FC_PORT_EDEFAULT.equals(dependentFCPort);
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_SYSTEM:
				return DEPENDENT_SYSTEM_EDEFAULT == null ? dependentSystem != null : !DEPENDENT_SYSTEM_EDEFAULT.equals(dependentSystem);
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_WWN:
				return DEPENDENT_FC_PORT_WWN_EDEFAULT == null ? dependentFCPortWWN != null : !DEPENDENT_FC_PORT_WWN_EDEFAULT.equals(dependentFCPortWWN);
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_ELEMENT_NAME:
				return DEPENDENT_FC_PORT_ELEMENT_NAME_EDEFAULT == null ? dependentFCPortElementName != null : !DEPENDENT_FC_PORT_ELEMENT_NAME_EDEFAULT.equals(dependentFCPortElementName);
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_ELEMENT_WWN:
				return DEPENDENT_ELEMENT_WWN_EDEFAULT == null ? dependentElementWWN != null : !DEPENDENT_ELEMENT_WWN_EDEFAULT.equals(dependentElementWWN);
			case CimPackage.CIM_FC_TOPOLOGY_VIEW__DEPENDENT_FC_PORT_TYPE:
				return DEPENDENT_FC_PORT_TYPE_EDEFAULT == null ? dependentFCPortType != null : !DEPENDENT_FC_PORT_TYPE_EDEFAULT.equals(dependentFCPortType);
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
		result.append(" (AntecedentFCPort: ");
		result.append(antecedentFCPort);
		result.append(", AntecedentSystem: ");
		result.append(antecedentSystem);
		result.append(", AntecedentFCPortWWN: ");
		result.append(antecedentFCPortWWN);
		result.append(", AntecedentFCPortElementName: ");
		result.append(antecedentFCPortElementName);
		result.append(", AntecedentElementWWN: ");
		result.append(antecedentElementWWN);
		result.append(", AntecedentFCPortType: ");
		result.append(antecedentFCPortType);
		result.append(", DependentFCPort: ");
		result.append(dependentFCPort);
		result.append(", DependentSystem: ");
		result.append(dependentSystem);
		result.append(", DependentFCPortWWN: ");
		result.append(dependentFCPortWWN);
		result.append(", DependentFCPortElementName: ");
		result.append(dependentFCPortElementName);
		result.append(", DependentElementWWN: ");
		result.append(dependentElementWWN);
		result.append(", DependentFCPortType: ");
		result.append(dependentFCPortType);
		result.append(')');
		return result.toString();
	}

} //CIM_FCTopologyViewImpl
