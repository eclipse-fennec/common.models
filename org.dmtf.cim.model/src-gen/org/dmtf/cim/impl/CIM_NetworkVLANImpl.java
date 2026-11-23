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

import org.dmtf.cim.CIM_NetworkVLAN;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network VLAN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkVLANImpl#getVLANId <em>VLAN Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkVLANImpl#getSAIdentifier <em>SA Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkVLANImpl#getTransmissionSize <em>Transmission Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkVLANImpl#getTypeOfMedia <em>Type Of Media</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkVLANImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NetworkVLANImpl extends CIM_ConnectivityCollectionImpl implements CIM_NetworkVLAN {
	/**
	 * The default value of the '{@link #getVLANId() <em>VLAN Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVLANId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VLAN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVLANId() <em>VLAN Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVLANId()
	 * @generated
	 * @ordered
	 */
	protected Integer vlanId = VLAN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSAIdentifier() <em>SA Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final Long SA_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSAIdentifier() <em>SA Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Long saIdentifier = SA_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmissionSize() <em>Transmission Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRANSMISSION_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransmissionSize() <em>Transmission Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionSize()
	 * @generated
	 * @ordered
	 */
	protected Integer transmissionSize = TRANSMISSION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeOfMedia() <em>Type Of Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfMedia()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_MEDIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfMedia() <em>Type Of Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfMedia()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfMedia = TYPE_OF_MEDIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherTypeDescription = OTHER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkVLANImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkVLAN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVLANId() {
		return vlanId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVLANId(Integer newVLANId) {
		Integer oldVLANId = vlanId;
		vlanId = newVLANId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_VLAN__VLAN_ID, oldVLANId, vlanId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSAIdentifier() {
		return saIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSAIdentifier(Long newSAIdentifier) {
		Long oldSAIdentifier = saIdentifier;
		saIdentifier = newSAIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_VLAN__SA_IDENTIFIER, oldSAIdentifier, saIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTransmissionSize() {
		return transmissionSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmissionSize(Integer newTransmissionSize) {
		Integer oldTransmissionSize = transmissionSize;
		transmissionSize = newTransmissionSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_VLAN__TRANSMISSION_SIZE, oldTransmissionSize, transmissionSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeOfMedia() {
		return typeOfMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfMedia(Integer newTypeOfMedia) {
		Integer oldTypeOfMedia = typeOfMedia;
		typeOfMedia = newTypeOfMedia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_VLAN__TYPE_OF_MEDIA, oldTypeOfMedia, typeOfMedia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTypeDescription() {
		return otherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTypeDescription(String newOtherTypeDescription) {
		String oldOtherTypeDescription = otherTypeDescription;
		otherTypeDescription = newOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_VLAN__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_VLAN__VLAN_ID:
				return getVLANId();
			case CimPackage.CIM_NETWORK_VLAN__SA_IDENTIFIER:
				return getSAIdentifier();
			case CimPackage.CIM_NETWORK_VLAN__TRANSMISSION_SIZE:
				return getTransmissionSize();
			case CimPackage.CIM_NETWORK_VLAN__TYPE_OF_MEDIA:
				return getTypeOfMedia();
			case CimPackage.CIM_NETWORK_VLAN__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
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
			case CimPackage.CIM_NETWORK_VLAN__VLAN_ID:
				setVLANId((Integer)newValue);
				return;
			case CimPackage.CIM_NETWORK_VLAN__SA_IDENTIFIER:
				setSAIdentifier((Long)newValue);
				return;
			case CimPackage.CIM_NETWORK_VLAN__TRANSMISSION_SIZE:
				setTransmissionSize((Integer)newValue);
				return;
			case CimPackage.CIM_NETWORK_VLAN__TYPE_OF_MEDIA:
				setTypeOfMedia((Integer)newValue);
				return;
			case CimPackage.CIM_NETWORK_VLAN__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
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
			case CimPackage.CIM_NETWORK_VLAN__VLAN_ID:
				setVLANId(VLAN_ID_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_VLAN__SA_IDENTIFIER:
				setSAIdentifier(SA_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_VLAN__TRANSMISSION_SIZE:
				setTransmissionSize(TRANSMISSION_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_VLAN__TYPE_OF_MEDIA:
				setTypeOfMedia(TYPE_OF_MEDIA_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_VLAN__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_NETWORK_VLAN__VLAN_ID:
				return VLAN_ID_EDEFAULT == null ? vlanId != null : !VLAN_ID_EDEFAULT.equals(vlanId);
			case CimPackage.CIM_NETWORK_VLAN__SA_IDENTIFIER:
				return SA_IDENTIFIER_EDEFAULT == null ? saIdentifier != null : !SA_IDENTIFIER_EDEFAULT.equals(saIdentifier);
			case CimPackage.CIM_NETWORK_VLAN__TRANSMISSION_SIZE:
				return TRANSMISSION_SIZE_EDEFAULT == null ? transmissionSize != null : !TRANSMISSION_SIZE_EDEFAULT.equals(transmissionSize);
			case CimPackage.CIM_NETWORK_VLAN__TYPE_OF_MEDIA:
				return TYPE_OF_MEDIA_EDEFAULT == null ? typeOfMedia != null : !TYPE_OF_MEDIA_EDEFAULT.equals(typeOfMedia);
			case CimPackage.CIM_NETWORK_VLAN__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
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
		result.append(" (VLANId: ");
		result.append(vlanId);
		result.append(", SAIdentifier: ");
		result.append(saIdentifier);
		result.append(", TransmissionSize: ");
		result.append(transmissionSize);
		result.append(", TypeOfMedia: ");
		result.append(typeOfMedia);
		result.append(", OtherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkVLANImpl
