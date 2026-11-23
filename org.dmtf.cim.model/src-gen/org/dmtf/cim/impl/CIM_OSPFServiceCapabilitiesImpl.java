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

import org.dmtf.cim.CIM_OSPFServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM OSPF Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFServiceCapabilitiesImpl#getSupportNSSA <em>Support NSSA</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFServiceCapabilitiesImpl#getSupportOnDemand <em>Support On Demand</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFServiceCapabilitiesImpl#getSupportMOSPF <em>Support MOSPF</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OSPFServiceCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_OSPFServiceCapabilities {
	/**
	 * The default value of the '{@link #getSupportNSSA() <em>Support NSSA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportNSSA()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORT_NSSA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportNSSA() <em>Support NSSA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportNSSA()
	 * @generated
	 * @ordered
	 */
	protected Boolean supportNSSA = SUPPORT_NSSA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportOnDemand() <em>Support On Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportOnDemand()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORT_ON_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportOnDemand() <em>Support On Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportOnDemand()
	 * @generated
	 * @ordered
	 */
	protected Boolean supportOnDemand = SUPPORT_ON_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportMOSPF() <em>Support MOSPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportMOSPF()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORT_MOSPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportMOSPF() <em>Support MOSPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportMOSPF()
	 * @generated
	 * @ordered
	 */
	protected Boolean supportMOSPF = SUPPORT_MOSPF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OSPFServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OSPFServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSupportNSSA() {
		return supportNSSA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportNSSA(Boolean newSupportNSSA) {
		Boolean oldSupportNSSA = supportNSSA;
		supportNSSA = newSupportNSSA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_NSSA, oldSupportNSSA, supportNSSA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSupportOnDemand() {
		return supportOnDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportOnDemand(Boolean newSupportOnDemand) {
		Boolean oldSupportOnDemand = supportOnDemand;
		supportOnDemand = newSupportOnDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_ON_DEMAND, oldSupportOnDemand, supportOnDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSupportMOSPF() {
		return supportMOSPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportMOSPF(Boolean newSupportMOSPF) {
		Boolean oldSupportMOSPF = supportMOSPF;
		supportMOSPF = newSupportMOSPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_MOSPF, oldSupportMOSPF, supportMOSPF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_NSSA:
				return getSupportNSSA();
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_ON_DEMAND:
				return getSupportOnDemand();
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_MOSPF:
				return getSupportMOSPF();
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
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_NSSA:
				setSupportNSSA((Boolean)newValue);
				return;
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_ON_DEMAND:
				setSupportOnDemand((Boolean)newValue);
				return;
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_MOSPF:
				setSupportMOSPF((Boolean)newValue);
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
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_NSSA:
				setSupportNSSA(SUPPORT_NSSA_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_ON_DEMAND:
				setSupportOnDemand(SUPPORT_ON_DEMAND_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_MOSPF:
				setSupportMOSPF(SUPPORT_MOSPF_EDEFAULT);
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
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_NSSA:
				return SUPPORT_NSSA_EDEFAULT == null ? supportNSSA != null : !SUPPORT_NSSA_EDEFAULT.equals(supportNSSA);
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_ON_DEMAND:
				return SUPPORT_ON_DEMAND_EDEFAULT == null ? supportOnDemand != null : !SUPPORT_ON_DEMAND_EDEFAULT.equals(supportOnDemand);
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES__SUPPORT_MOSPF:
				return SUPPORT_MOSPF_EDEFAULT == null ? supportMOSPF != null : !SUPPORT_MOSPF_EDEFAULT.equals(supportMOSPF);
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
		result.append(" (SupportNSSA: ");
		result.append(supportNSSA);
		result.append(", SupportOnDemand: ");
		result.append(supportOnDemand);
		result.append(", SupportMOSPF: ");
		result.append(supportMOSPF);
		result.append(')');
		return result.toString();
	}

} //CIM_OSPFServiceCapabilitiesImpl
