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

import org.dmtf.cim.CIM_VLANEndpointCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM VLAN Endpoint Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointCapabilitiesImpl#getDot1QTagging <em>Dot1 QTagging</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointCapabilitiesImpl#getDot1qAcceptableVLANFramesTypes <em>Dot1q Acceptable VLAN Frames Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointCapabilitiesImpl#getDot1qIngressFiltering <em>Dot1q Ingress Filtering</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointCapabilitiesImpl#getSupportsTrunkEncapsulationNegotiation <em>Supports Trunk Encapsulation Negotiation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VLANEndpointCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_VLANEndpointCapabilities {
	/**
	 * The default value of the '{@link #getDot1QTagging() <em>Dot1 QTagging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot1QTagging()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DOT1_QTAGGING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDot1QTagging() <em>Dot1 QTagging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot1QTagging()
	 * @generated
	 * @ordered
	 */
	protected Boolean dot1QTagging = DOT1_QTAGGING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDot1qAcceptableVLANFramesTypes() <em>Dot1q Acceptable VLAN Frames Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot1qAcceptableVLANFramesTypes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DOT1Q_ACCEPTABLE_VLAN_FRAMES_TYPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDot1qAcceptableVLANFramesTypes() <em>Dot1q Acceptable VLAN Frames Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot1qAcceptableVLANFramesTypes()
	 * @generated
	 * @ordered
	 */
	protected Integer dot1qAcceptableVLANFramesTypes = DOT1Q_ACCEPTABLE_VLAN_FRAMES_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDot1qIngressFiltering() <em>Dot1q Ingress Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot1qIngressFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DOT1Q_INGRESS_FILTERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDot1qIngressFiltering() <em>Dot1q Ingress Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot1qIngressFiltering()
	 * @generated
	 * @ordered
	 */
	protected Boolean dot1qIngressFiltering = DOT1Q_INGRESS_FILTERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportsTrunkEncapsulationNegotiation() <em>Supports Trunk Encapsulation Negotiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsTrunkEncapsulationNegotiation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORTS_TRUNK_ENCAPSULATION_NEGOTIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportsTrunkEncapsulationNegotiation() <em>Supports Trunk Encapsulation Negotiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsTrunkEncapsulationNegotiation()
	 * @generated
	 * @ordered
	 */
	protected Boolean supportsTrunkEncapsulationNegotiation = SUPPORTS_TRUNK_ENCAPSULATION_NEGOTIATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VLANEndpointCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VLANEndpointCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDot1QTagging() {
		return dot1QTagging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDot1QTagging(Boolean newDot1QTagging) {
		Boolean oldDot1QTagging = dot1QTagging;
		dot1QTagging = newDot1QTagging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1_QTAGGING, oldDot1QTagging, dot1QTagging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDot1qAcceptableVLANFramesTypes() {
		return dot1qAcceptableVLANFramesTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDot1qAcceptableVLANFramesTypes(Integer newDot1qAcceptableVLANFramesTypes) {
		Integer oldDot1qAcceptableVLANFramesTypes = dot1qAcceptableVLANFramesTypes;
		dot1qAcceptableVLANFramesTypes = newDot1qAcceptableVLANFramesTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1Q_ACCEPTABLE_VLAN_FRAMES_TYPES, oldDot1qAcceptableVLANFramesTypes, dot1qAcceptableVLANFramesTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDot1qIngressFiltering() {
		return dot1qIngressFiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDot1qIngressFiltering(Boolean newDot1qIngressFiltering) {
		Boolean oldDot1qIngressFiltering = dot1qIngressFiltering;
		dot1qIngressFiltering = newDot1qIngressFiltering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1Q_INGRESS_FILTERING, oldDot1qIngressFiltering, dot1qIngressFiltering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSupportsTrunkEncapsulationNegotiation() {
		return supportsTrunkEncapsulationNegotiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsTrunkEncapsulationNegotiation(Boolean newSupportsTrunkEncapsulationNegotiation) {
		Boolean oldSupportsTrunkEncapsulationNegotiation = supportsTrunkEncapsulationNegotiation;
		supportsTrunkEncapsulationNegotiation = newSupportsTrunkEncapsulationNegotiation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__SUPPORTS_TRUNK_ENCAPSULATION_NEGOTIATION, oldSupportsTrunkEncapsulationNegotiation, supportsTrunkEncapsulationNegotiation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1_QTAGGING:
				return getDot1QTagging();
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1Q_ACCEPTABLE_VLAN_FRAMES_TYPES:
				return getDot1qAcceptableVLANFramesTypes();
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1Q_INGRESS_FILTERING:
				return getDot1qIngressFiltering();
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__SUPPORTS_TRUNK_ENCAPSULATION_NEGOTIATION:
				return getSupportsTrunkEncapsulationNegotiation();
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
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1_QTAGGING:
				setDot1QTagging((Boolean)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1Q_ACCEPTABLE_VLAN_FRAMES_TYPES:
				setDot1qAcceptableVLANFramesTypes((Integer)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1Q_INGRESS_FILTERING:
				setDot1qIngressFiltering((Boolean)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__SUPPORTS_TRUNK_ENCAPSULATION_NEGOTIATION:
				setSupportsTrunkEncapsulationNegotiation((Boolean)newValue);
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
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1_QTAGGING:
				setDot1QTagging(DOT1_QTAGGING_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1Q_ACCEPTABLE_VLAN_FRAMES_TYPES:
				setDot1qAcceptableVLANFramesTypes(DOT1Q_ACCEPTABLE_VLAN_FRAMES_TYPES_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1Q_INGRESS_FILTERING:
				setDot1qIngressFiltering(DOT1Q_INGRESS_FILTERING_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__SUPPORTS_TRUNK_ENCAPSULATION_NEGOTIATION:
				setSupportsTrunkEncapsulationNegotiation(SUPPORTS_TRUNK_ENCAPSULATION_NEGOTIATION_EDEFAULT);
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
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1_QTAGGING:
				return DOT1_QTAGGING_EDEFAULT == null ? dot1QTagging != null : !DOT1_QTAGGING_EDEFAULT.equals(dot1QTagging);
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1Q_ACCEPTABLE_VLAN_FRAMES_TYPES:
				return DOT1Q_ACCEPTABLE_VLAN_FRAMES_TYPES_EDEFAULT == null ? dot1qAcceptableVLANFramesTypes != null : !DOT1Q_ACCEPTABLE_VLAN_FRAMES_TYPES_EDEFAULT.equals(dot1qAcceptableVLANFramesTypes);
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__DOT1Q_INGRESS_FILTERING:
				return DOT1Q_INGRESS_FILTERING_EDEFAULT == null ? dot1qIngressFiltering != null : !DOT1Q_INGRESS_FILTERING_EDEFAULT.equals(dot1qIngressFiltering);
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES__SUPPORTS_TRUNK_ENCAPSULATION_NEGOTIATION:
				return SUPPORTS_TRUNK_ENCAPSULATION_NEGOTIATION_EDEFAULT == null ? supportsTrunkEncapsulationNegotiation != null : !SUPPORTS_TRUNK_ENCAPSULATION_NEGOTIATION_EDEFAULT.equals(supportsTrunkEncapsulationNegotiation);
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
		result.append(" (Dot1QTagging: ");
		result.append(dot1QTagging);
		result.append(", Dot1qAcceptableVLANFramesTypes: ");
		result.append(dot1qAcceptableVLANFramesTypes);
		result.append(", Dot1qIngressFiltering: ");
		result.append(dot1qIngressFiltering);
		result.append(", SupportsTrunkEncapsulationNegotiation: ");
		result.append(supportsTrunkEncapsulationNegotiation);
		result.append(')');
		return result.toString();
	}

} //CIM_VLANEndpointCapabilitiesImpl
