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

import org.dmtf.cim.CIM_VLANEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM VLAN Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointImpl#getDesiredEndpointMode <em>Desired Endpoint Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointImpl#getOtherEndpointMode <em>Other Endpoint Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointImpl#getOperationalEndpointMode <em>Operational Endpoint Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointImpl#getDesiredVLANTrunkEncapsulation <em>Desired VLAN Trunk Encapsulation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointImpl#getOtherTrunkEncapsulation <em>Other Trunk Encapsulation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointImpl#getOperationalVLANTrunkEncapsulation <em>Operational VLAN Trunk Encapsulation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointImpl#getGVRPStatus <em>GVRP Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VLANEndpointImpl extends CIM_ProtocolEndpointImpl implements CIM_VLANEndpoint {
	/**
	 * The default value of the '{@link #getDesiredEndpointMode() <em>Desired Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredEndpointMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESIRED_ENDPOINT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesiredEndpointMode() <em>Desired Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredEndpointMode()
	 * @generated
	 * @ordered
	 */
	protected Integer desiredEndpointMode = DESIRED_ENDPOINT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEndpointMode() <em>Other Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEndpointMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENDPOINT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEndpointMode() <em>Other Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEndpointMode()
	 * @generated
	 * @ordered
	 */
	protected String otherEndpointMode = OTHER_ENDPOINT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationalEndpointMode() <em>Operational Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalEndpointMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPERATIONAL_ENDPOINT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationalEndpointMode() <em>Operational Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalEndpointMode()
	 * @generated
	 * @ordered
	 */
	protected Integer operationalEndpointMode = OPERATIONAL_ENDPOINT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesiredVLANTrunkEncapsulation() <em>Desired VLAN Trunk Encapsulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredVLANTrunkEncapsulation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESIRED_VLAN_TRUNK_ENCAPSULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesiredVLANTrunkEncapsulation() <em>Desired VLAN Trunk Encapsulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredVLANTrunkEncapsulation()
	 * @generated
	 * @ordered
	 */
	protected Integer desiredVLANTrunkEncapsulation = DESIRED_VLAN_TRUNK_ENCAPSULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTrunkEncapsulation() <em>Other Trunk Encapsulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTrunkEncapsulation()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TRUNK_ENCAPSULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTrunkEncapsulation() <em>Other Trunk Encapsulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTrunkEncapsulation()
	 * @generated
	 * @ordered
	 */
	protected String otherTrunkEncapsulation = OTHER_TRUNK_ENCAPSULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationalVLANTrunkEncapsulation() <em>Operational VLAN Trunk Encapsulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalVLANTrunkEncapsulation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPERATIONAL_VLAN_TRUNK_ENCAPSULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationalVLANTrunkEncapsulation() <em>Operational VLAN Trunk Encapsulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalVLANTrunkEncapsulation()
	 * @generated
	 * @ordered
	 */
	protected Integer operationalVLANTrunkEncapsulation = OPERATIONAL_VLAN_TRUNK_ENCAPSULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGVRPStatus() <em>GVRP Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGVRPStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer GVRP_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGVRPStatus() <em>GVRP Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGVRPStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer gvrpStatus = GVRP_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VLANEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VLANEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDesiredEndpointMode() {
		return desiredEndpointMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesiredEndpointMode(Integer newDesiredEndpointMode) {
		Integer oldDesiredEndpointMode = desiredEndpointMode;
		desiredEndpointMode = newDesiredEndpointMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT__DESIRED_ENDPOINT_MODE, oldDesiredEndpointMode, desiredEndpointMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherEndpointMode() {
		return otherEndpointMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherEndpointMode(String newOtherEndpointMode) {
		String oldOtherEndpointMode = otherEndpointMode;
		otherEndpointMode = newOtherEndpointMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT__OTHER_ENDPOINT_MODE, oldOtherEndpointMode, otherEndpointMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOperationalEndpointMode() {
		return operationalEndpointMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationalEndpointMode(Integer newOperationalEndpointMode) {
		Integer oldOperationalEndpointMode = operationalEndpointMode;
		operationalEndpointMode = newOperationalEndpointMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT__OPERATIONAL_ENDPOINT_MODE, oldOperationalEndpointMode, operationalEndpointMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDesiredVLANTrunkEncapsulation() {
		return desiredVLANTrunkEncapsulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesiredVLANTrunkEncapsulation(Integer newDesiredVLANTrunkEncapsulation) {
		Integer oldDesiredVLANTrunkEncapsulation = desiredVLANTrunkEncapsulation;
		desiredVLANTrunkEncapsulation = newDesiredVLANTrunkEncapsulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT__DESIRED_VLAN_TRUNK_ENCAPSULATION, oldDesiredVLANTrunkEncapsulation, desiredVLANTrunkEncapsulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTrunkEncapsulation() {
		return otherTrunkEncapsulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTrunkEncapsulation(String newOtherTrunkEncapsulation) {
		String oldOtherTrunkEncapsulation = otherTrunkEncapsulation;
		otherTrunkEncapsulation = newOtherTrunkEncapsulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT__OTHER_TRUNK_ENCAPSULATION, oldOtherTrunkEncapsulation, otherTrunkEncapsulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOperationalVLANTrunkEncapsulation() {
		return operationalVLANTrunkEncapsulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationalVLANTrunkEncapsulation(Integer newOperationalVLANTrunkEncapsulation) {
		Integer oldOperationalVLANTrunkEncapsulation = operationalVLANTrunkEncapsulation;
		operationalVLANTrunkEncapsulation = newOperationalVLANTrunkEncapsulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT__OPERATIONAL_VLAN_TRUNK_ENCAPSULATION, oldOperationalVLANTrunkEncapsulation, operationalVLANTrunkEncapsulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getGVRPStatus() {
		return gvrpStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGVRPStatus(Integer newGVRPStatus) {
		Integer oldGVRPStatus = gvrpStatus;
		gvrpStatus = newGVRPStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT__GVRP_STATUS, oldGVRPStatus, gvrpStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VLAN_ENDPOINT__DESIRED_ENDPOINT_MODE:
				return getDesiredEndpointMode();
			case CimPackage.CIM_VLAN_ENDPOINT__OTHER_ENDPOINT_MODE:
				return getOtherEndpointMode();
			case CimPackage.CIM_VLAN_ENDPOINT__OPERATIONAL_ENDPOINT_MODE:
				return getOperationalEndpointMode();
			case CimPackage.CIM_VLAN_ENDPOINT__DESIRED_VLAN_TRUNK_ENCAPSULATION:
				return getDesiredVLANTrunkEncapsulation();
			case CimPackage.CIM_VLAN_ENDPOINT__OTHER_TRUNK_ENCAPSULATION:
				return getOtherTrunkEncapsulation();
			case CimPackage.CIM_VLAN_ENDPOINT__OPERATIONAL_VLAN_TRUNK_ENCAPSULATION:
				return getOperationalVLANTrunkEncapsulation();
			case CimPackage.CIM_VLAN_ENDPOINT__GVRP_STATUS:
				return getGVRPStatus();
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
			case CimPackage.CIM_VLAN_ENDPOINT__DESIRED_ENDPOINT_MODE:
				setDesiredEndpointMode((Integer)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT__OTHER_ENDPOINT_MODE:
				setOtherEndpointMode((String)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT__OPERATIONAL_ENDPOINT_MODE:
				setOperationalEndpointMode((Integer)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT__DESIRED_VLAN_TRUNK_ENCAPSULATION:
				setDesiredVLANTrunkEncapsulation((Integer)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT__OTHER_TRUNK_ENCAPSULATION:
				setOtherTrunkEncapsulation((String)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT__OPERATIONAL_VLAN_TRUNK_ENCAPSULATION:
				setOperationalVLANTrunkEncapsulation((Integer)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT__GVRP_STATUS:
				setGVRPStatus((Integer)newValue);
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
			case CimPackage.CIM_VLAN_ENDPOINT__DESIRED_ENDPOINT_MODE:
				setDesiredEndpointMode(DESIRED_ENDPOINT_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT__OTHER_ENDPOINT_MODE:
				setOtherEndpointMode(OTHER_ENDPOINT_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT__OPERATIONAL_ENDPOINT_MODE:
				setOperationalEndpointMode(OPERATIONAL_ENDPOINT_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT__DESIRED_VLAN_TRUNK_ENCAPSULATION:
				setDesiredVLANTrunkEncapsulation(DESIRED_VLAN_TRUNK_ENCAPSULATION_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT__OTHER_TRUNK_ENCAPSULATION:
				setOtherTrunkEncapsulation(OTHER_TRUNK_ENCAPSULATION_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT__OPERATIONAL_VLAN_TRUNK_ENCAPSULATION:
				setOperationalVLANTrunkEncapsulation(OPERATIONAL_VLAN_TRUNK_ENCAPSULATION_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT__GVRP_STATUS:
				setGVRPStatus(GVRP_STATUS_EDEFAULT);
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
			case CimPackage.CIM_VLAN_ENDPOINT__DESIRED_ENDPOINT_MODE:
				return DESIRED_ENDPOINT_MODE_EDEFAULT == null ? desiredEndpointMode != null : !DESIRED_ENDPOINT_MODE_EDEFAULT.equals(desiredEndpointMode);
			case CimPackage.CIM_VLAN_ENDPOINT__OTHER_ENDPOINT_MODE:
				return OTHER_ENDPOINT_MODE_EDEFAULT == null ? otherEndpointMode != null : !OTHER_ENDPOINT_MODE_EDEFAULT.equals(otherEndpointMode);
			case CimPackage.CIM_VLAN_ENDPOINT__OPERATIONAL_ENDPOINT_MODE:
				return OPERATIONAL_ENDPOINT_MODE_EDEFAULT == null ? operationalEndpointMode != null : !OPERATIONAL_ENDPOINT_MODE_EDEFAULT.equals(operationalEndpointMode);
			case CimPackage.CIM_VLAN_ENDPOINT__DESIRED_VLAN_TRUNK_ENCAPSULATION:
				return DESIRED_VLAN_TRUNK_ENCAPSULATION_EDEFAULT == null ? desiredVLANTrunkEncapsulation != null : !DESIRED_VLAN_TRUNK_ENCAPSULATION_EDEFAULT.equals(desiredVLANTrunkEncapsulation);
			case CimPackage.CIM_VLAN_ENDPOINT__OTHER_TRUNK_ENCAPSULATION:
				return OTHER_TRUNK_ENCAPSULATION_EDEFAULT == null ? otherTrunkEncapsulation != null : !OTHER_TRUNK_ENCAPSULATION_EDEFAULT.equals(otherTrunkEncapsulation);
			case CimPackage.CIM_VLAN_ENDPOINT__OPERATIONAL_VLAN_TRUNK_ENCAPSULATION:
				return OPERATIONAL_VLAN_TRUNK_ENCAPSULATION_EDEFAULT == null ? operationalVLANTrunkEncapsulation != null : !OPERATIONAL_VLAN_TRUNK_ENCAPSULATION_EDEFAULT.equals(operationalVLANTrunkEncapsulation);
			case CimPackage.CIM_VLAN_ENDPOINT__GVRP_STATUS:
				return GVRP_STATUS_EDEFAULT == null ? gvrpStatus != null : !GVRP_STATUS_EDEFAULT.equals(gvrpStatus);
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
		result.append(" (DesiredEndpointMode: ");
		result.append(desiredEndpointMode);
		result.append(", OtherEndpointMode: ");
		result.append(otherEndpointMode);
		result.append(", OperationalEndpointMode: ");
		result.append(operationalEndpointMode);
		result.append(", DesiredVLANTrunkEncapsulation: ");
		result.append(desiredVLANTrunkEncapsulation);
		result.append(", OtherTrunkEncapsulation: ");
		result.append(otherTrunkEncapsulation);
		result.append(", OperationalVLANTrunkEncapsulation: ");
		result.append(operationalVLANTrunkEncapsulation);
		result.append(", GVRPStatus: ");
		result.append(gvrpStatus);
		result.append(')');
		return result.toString();
	}

} //CIM_VLANEndpointImpl
