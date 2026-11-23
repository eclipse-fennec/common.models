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

import java.util.Collection;

import org.dmtf.cim.CIM_VLANNetwork;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM VLAN Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANNetworkImpl#getVLANId <em>VLAN Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANNetworkImpl#getSAIdentifier <em>SA Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANNetworkImpl#getTransmissionSize <em>Transmission Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANNetworkImpl#getTypeOfMedia <em>Type Of Media</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANNetworkImpl#getPrivateVLANType <em>Private VLAN Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANNetworkImpl#getPrimaryVLANId <em>Primary VLAN Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANNetworkImpl#getAssociatedVLANIds <em>Associated VLAN Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VLANNetworkImpl extends CIM_NetworkImpl implements CIM_VLANNetwork {
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
	protected static final Long TRANSMISSION_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransmissionSize() <em>Transmission Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionSize()
	 * @generated
	 * @ordered
	 */
	protected Long transmissionSize = TRANSMISSION_SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getPrivateVLANType() <em>Private VLAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateVLANType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIVATE_VLAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateVLANType() <em>Private VLAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateVLANType()
	 * @generated
	 * @ordered
	 */
	protected Integer privateVLANType = PRIVATE_VLAN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryVLANId() <em>Primary VLAN Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryVLANId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIMARY_VLAN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryVLANId() <em>Primary VLAN Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryVLANId()
	 * @generated
	 * @ordered
	 */
	protected Integer primaryVLANId = PRIMARY_VLAN_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociatedVLANIds() <em>Associated VLAN Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedVLANIds()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> associatedVLANIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VLANNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VLANNetwork();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_NETWORK__VLAN_ID, oldVLANId, vlanId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_NETWORK__SA_IDENTIFIER, oldSAIdentifier, saIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTransmissionSize() {
		return transmissionSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmissionSize(Long newTransmissionSize) {
		Long oldTransmissionSize = transmissionSize;
		transmissionSize = newTransmissionSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_NETWORK__TRANSMISSION_SIZE, oldTransmissionSize, transmissionSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_NETWORK__TYPE_OF_MEDIA, oldTypeOfMedia, typeOfMedia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrivateVLANType() {
		return privateVLANType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateVLANType(Integer newPrivateVLANType) {
		Integer oldPrivateVLANType = privateVLANType;
		privateVLANType = newPrivateVLANType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_NETWORK__PRIVATE_VLAN_TYPE, oldPrivateVLANType, privateVLANType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrimaryVLANId() {
		return primaryVLANId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryVLANId(Integer newPrimaryVLANId) {
		Integer oldPrimaryVLANId = primaryVLANId;
		primaryVLANId = newPrimaryVLANId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_NETWORK__PRIMARY_VLAN_ID, oldPrimaryVLANId, primaryVLANId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAssociatedVLANIds() {
		if (associatedVLANIds == null) {
			associatedVLANIds = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VLAN_NETWORK__ASSOCIATED_VLAN_IDS);
		}
		return associatedVLANIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VLAN_NETWORK__VLAN_ID:
				return getVLANId();
			case CimPackage.CIM_VLAN_NETWORK__SA_IDENTIFIER:
				return getSAIdentifier();
			case CimPackage.CIM_VLAN_NETWORK__TRANSMISSION_SIZE:
				return getTransmissionSize();
			case CimPackage.CIM_VLAN_NETWORK__TYPE_OF_MEDIA:
				return getTypeOfMedia();
			case CimPackage.CIM_VLAN_NETWORK__PRIVATE_VLAN_TYPE:
				return getPrivateVLANType();
			case CimPackage.CIM_VLAN_NETWORK__PRIMARY_VLAN_ID:
				return getPrimaryVLANId();
			case CimPackage.CIM_VLAN_NETWORK__ASSOCIATED_VLAN_IDS:
				return getAssociatedVLANIds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_VLAN_NETWORK__VLAN_ID:
				setVLANId((Integer)newValue);
				return;
			case CimPackage.CIM_VLAN_NETWORK__SA_IDENTIFIER:
				setSAIdentifier((Long)newValue);
				return;
			case CimPackage.CIM_VLAN_NETWORK__TRANSMISSION_SIZE:
				setTransmissionSize((Long)newValue);
				return;
			case CimPackage.CIM_VLAN_NETWORK__TYPE_OF_MEDIA:
				setTypeOfMedia((Integer)newValue);
				return;
			case CimPackage.CIM_VLAN_NETWORK__PRIVATE_VLAN_TYPE:
				setPrivateVLANType((Integer)newValue);
				return;
			case CimPackage.CIM_VLAN_NETWORK__PRIMARY_VLAN_ID:
				setPrimaryVLANId((Integer)newValue);
				return;
			case CimPackage.CIM_VLAN_NETWORK__ASSOCIATED_VLAN_IDS:
				getAssociatedVLANIds().clear();
				getAssociatedVLANIds().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_VLAN_NETWORK__VLAN_ID:
				setVLANId(VLAN_ID_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_NETWORK__SA_IDENTIFIER:
				setSAIdentifier(SA_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_NETWORK__TRANSMISSION_SIZE:
				setTransmissionSize(TRANSMISSION_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_NETWORK__TYPE_OF_MEDIA:
				setTypeOfMedia(TYPE_OF_MEDIA_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_NETWORK__PRIVATE_VLAN_TYPE:
				setPrivateVLANType(PRIVATE_VLAN_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_NETWORK__PRIMARY_VLAN_ID:
				setPrimaryVLANId(PRIMARY_VLAN_ID_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_NETWORK__ASSOCIATED_VLAN_IDS:
				getAssociatedVLANIds().clear();
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
			case CimPackage.CIM_VLAN_NETWORK__VLAN_ID:
				return VLAN_ID_EDEFAULT == null ? vlanId != null : !VLAN_ID_EDEFAULT.equals(vlanId);
			case CimPackage.CIM_VLAN_NETWORK__SA_IDENTIFIER:
				return SA_IDENTIFIER_EDEFAULT == null ? saIdentifier != null : !SA_IDENTIFIER_EDEFAULT.equals(saIdentifier);
			case CimPackage.CIM_VLAN_NETWORK__TRANSMISSION_SIZE:
				return TRANSMISSION_SIZE_EDEFAULT == null ? transmissionSize != null : !TRANSMISSION_SIZE_EDEFAULT.equals(transmissionSize);
			case CimPackage.CIM_VLAN_NETWORK__TYPE_OF_MEDIA:
				return TYPE_OF_MEDIA_EDEFAULT == null ? typeOfMedia != null : !TYPE_OF_MEDIA_EDEFAULT.equals(typeOfMedia);
			case CimPackage.CIM_VLAN_NETWORK__PRIVATE_VLAN_TYPE:
				return PRIVATE_VLAN_TYPE_EDEFAULT == null ? privateVLANType != null : !PRIVATE_VLAN_TYPE_EDEFAULT.equals(privateVLANType);
			case CimPackage.CIM_VLAN_NETWORK__PRIMARY_VLAN_ID:
				return PRIMARY_VLAN_ID_EDEFAULT == null ? primaryVLANId != null : !PRIMARY_VLAN_ID_EDEFAULT.equals(primaryVLANId);
			case CimPackage.CIM_VLAN_NETWORK__ASSOCIATED_VLAN_IDS:
				return associatedVLANIds != null && !associatedVLANIds.isEmpty();
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
		result.append(", PrivateVLANType: ");
		result.append(privateVLANType);
		result.append(", PrimaryVLANId: ");
		result.append(primaryVLANId);
		result.append(", AssociatedVLANIds: ");
		result.append(associatedVLANIds);
		result.append(')');
		return result.toString();
	}

} //CIM_VLANNetworkImpl
