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

import org.dmtf.cim.CIM_IPsecAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IPsec Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPsecActionImpl#getUsePFS <em>Use PFS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPsecActionImpl#getUsePhase1Group <em>Use Phase1 Group</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPsecActionImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPsecActionImpl#getVendorID <em>Vendor ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPsecActionImpl#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPsecActionImpl#getOtherGranularity <em>Other Granularity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IPsecActionImpl extends CIM_SANegotiationActionImpl implements CIM_IPsecAction {
	/**
	 * The default value of the '{@link #getUsePFS() <em>Use PFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsePFS()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_PFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsePFS() <em>Use PFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsePFS()
	 * @generated
	 * @ordered
	 */
	protected Boolean usePFS = USE_PFS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsePhase1Group() <em>Use Phase1 Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsePhase1Group()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_PHASE1_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsePhase1Group() <em>Use Phase1 Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsePhase1Group()
	 * @generated
	 * @ordered
	 */
	protected Boolean usePhase1Group = USE_PHASE1_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected Integer groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorID() <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorID() <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected String vendorID = VENDOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGranularity() <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer GRANULARITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGranularity() <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularity()
	 * @generated
	 * @ordered
	 */
	protected Integer granularity = GRANULARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherGranularity() <em>Other Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherGranularity()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_GRANULARITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherGranularity() <em>Other Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherGranularity()
	 * @generated
	 * @ordered
	 */
	protected String otherGranularity = OTHER_GRANULARITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPsecActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPsecAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUsePFS() {
		return usePFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsePFS(Boolean newUsePFS) {
		Boolean oldUsePFS = usePFS;
		usePFS = newUsePFS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSEC_ACTION__USE_PFS, oldUsePFS, usePFS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUsePhase1Group() {
		return usePhase1Group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsePhase1Group(Boolean newUsePhase1Group) {
		Boolean oldUsePhase1Group = usePhase1Group;
		usePhase1Group = newUsePhase1Group;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSEC_ACTION__USE_PHASE1_GROUP, oldUsePhase1Group, usePhase1Group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(Integer newGroupId) {
		Integer oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSEC_ACTION__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendorID() {
		return vendorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorID(String newVendorID) {
		String oldVendorID = vendorID;
		vendorID = newVendorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSEC_ACTION__VENDOR_ID, oldVendorID, vendorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getGranularity() {
		return granularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGranularity(Integer newGranularity) {
		Integer oldGranularity = granularity;
		granularity = newGranularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSEC_ACTION__GRANULARITY, oldGranularity, granularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherGranularity() {
		return otherGranularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherGranularity(String newOtherGranularity) {
		String oldOtherGranularity = otherGranularity;
		otherGranularity = newOtherGranularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSEC_ACTION__OTHER_GRANULARITY, oldOtherGranularity, otherGranularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IPSEC_ACTION__USE_PFS:
				return getUsePFS();
			case CimPackage.CIM_IPSEC_ACTION__USE_PHASE1_GROUP:
				return getUsePhase1Group();
			case CimPackage.CIM_IPSEC_ACTION__GROUP_ID:
				return getGroupId();
			case CimPackage.CIM_IPSEC_ACTION__VENDOR_ID:
				return getVendorID();
			case CimPackage.CIM_IPSEC_ACTION__GRANULARITY:
				return getGranularity();
			case CimPackage.CIM_IPSEC_ACTION__OTHER_GRANULARITY:
				return getOtherGranularity();
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
			case CimPackage.CIM_IPSEC_ACTION__USE_PFS:
				setUsePFS((Boolean)newValue);
				return;
			case CimPackage.CIM_IPSEC_ACTION__USE_PHASE1_GROUP:
				setUsePhase1Group((Boolean)newValue);
				return;
			case CimPackage.CIM_IPSEC_ACTION__GROUP_ID:
				setGroupId((Integer)newValue);
				return;
			case CimPackage.CIM_IPSEC_ACTION__VENDOR_ID:
				setVendorID((String)newValue);
				return;
			case CimPackage.CIM_IPSEC_ACTION__GRANULARITY:
				setGranularity((Integer)newValue);
				return;
			case CimPackage.CIM_IPSEC_ACTION__OTHER_GRANULARITY:
				setOtherGranularity((String)newValue);
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
			case CimPackage.CIM_IPSEC_ACTION__USE_PFS:
				setUsePFS(USE_PFS_EDEFAULT);
				return;
			case CimPackage.CIM_IPSEC_ACTION__USE_PHASE1_GROUP:
				setUsePhase1Group(USE_PHASE1_GROUP_EDEFAULT);
				return;
			case CimPackage.CIM_IPSEC_ACTION__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case CimPackage.CIM_IPSEC_ACTION__VENDOR_ID:
				setVendorID(VENDOR_ID_EDEFAULT);
				return;
			case CimPackage.CIM_IPSEC_ACTION__GRANULARITY:
				setGranularity(GRANULARITY_EDEFAULT);
				return;
			case CimPackage.CIM_IPSEC_ACTION__OTHER_GRANULARITY:
				setOtherGranularity(OTHER_GRANULARITY_EDEFAULT);
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
			case CimPackage.CIM_IPSEC_ACTION__USE_PFS:
				return USE_PFS_EDEFAULT == null ? usePFS != null : !USE_PFS_EDEFAULT.equals(usePFS);
			case CimPackage.CIM_IPSEC_ACTION__USE_PHASE1_GROUP:
				return USE_PHASE1_GROUP_EDEFAULT == null ? usePhase1Group != null : !USE_PHASE1_GROUP_EDEFAULT.equals(usePhase1Group);
			case CimPackage.CIM_IPSEC_ACTION__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case CimPackage.CIM_IPSEC_ACTION__VENDOR_ID:
				return VENDOR_ID_EDEFAULT == null ? vendorID != null : !VENDOR_ID_EDEFAULT.equals(vendorID);
			case CimPackage.CIM_IPSEC_ACTION__GRANULARITY:
				return GRANULARITY_EDEFAULT == null ? granularity != null : !GRANULARITY_EDEFAULT.equals(granularity);
			case CimPackage.CIM_IPSEC_ACTION__OTHER_GRANULARITY:
				return OTHER_GRANULARITY_EDEFAULT == null ? otherGranularity != null : !OTHER_GRANULARITY_EDEFAULT.equals(otherGranularity);
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
		result.append(" (UsePFS: ");
		result.append(usePFS);
		result.append(", UsePhase1Group: ");
		result.append(usePhase1Group);
		result.append(", GroupId: ");
		result.append(groupId);
		result.append(", VendorID: ");
		result.append(vendorID);
		result.append(", Granularity: ");
		result.append(granularity);
		result.append(", OtherGranularity: ");
		result.append(otherGranularity);
		result.append(')');
		return result.toString();
	}

} //CIM_IPsecActionImpl
