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

import org.dmtf.cim.CIM_Hdr8021Filter;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Hdr8021 Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_Hdr8021FilterImpl#getHdrSrcMACAddr8021 <em>Hdr Src MAC Addr8021</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_Hdr8021FilterImpl#getHdrSrcMACMask8021 <em>Hdr Src MAC Mask8021</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_Hdr8021FilterImpl#getHdrDestMACAddr8021 <em>Hdr Dest MAC Addr8021</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_Hdr8021FilterImpl#getHdrDestMACMask8021 <em>Hdr Dest MAC Mask8021</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_Hdr8021FilterImpl#getHdrProtocolID8021 <em>Hdr Protocol ID8021</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_Hdr8021FilterImpl#getHdrPriorityValue8021 <em>Hdr Priority Value8021</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_Hdr8021FilterImpl#getHdrVLANID8021 <em>Hdr VLANID8021</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_Hdr8021FilterImpl extends CIM_FilterEntryBaseImpl implements CIM_Hdr8021Filter {
	/**
	 * The cached value of the '{@link #getHdrSrcMACAddr8021() <em>Hdr Src MAC Addr8021</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcMACAddr8021()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrSrcMACAddr8021;

	/**
	 * The cached value of the '{@link #getHdrSrcMACMask8021() <em>Hdr Src MAC Mask8021</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcMACMask8021()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrSrcMACMask8021;

	/**
	 * The cached value of the '{@link #getHdrDestMACAddr8021() <em>Hdr Dest MAC Addr8021</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestMACAddr8021()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrDestMACAddr8021;

	/**
	 * The cached value of the '{@link #getHdrDestMACMask8021() <em>Hdr Dest MAC Mask8021</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestMACMask8021()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrDestMACMask8021;

	/**
	 * The default value of the '{@link #getHdrProtocolID8021() <em>Hdr Protocol ID8021</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrProtocolID8021()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HDR_PROTOCOL_ID8021_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdrProtocolID8021() <em>Hdr Protocol ID8021</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrProtocolID8021()
	 * @generated
	 * @ordered
	 */
	protected Integer hdrProtocolID8021 = HDR_PROTOCOL_ID8021_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdrPriorityValue8021() <em>Hdr Priority Value8021</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrPriorityValue8021()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HDR_PRIORITY_VALUE8021_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdrPriorityValue8021() <em>Hdr Priority Value8021</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrPriorityValue8021()
	 * @generated
	 * @ordered
	 */
	protected Integer hdrPriorityValue8021 = HDR_PRIORITY_VALUE8021_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdrVLANID8021() <em>Hdr VLANID8021</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrVLANID8021()
	 * @generated
	 * @ordered
	 */
	protected static final Long HDR_VLANID8021_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdrVLANID8021() <em>Hdr VLANID8021</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrVLANID8021()
	 * @generated
	 * @ordered
	 */
	protected Long hdrVLANID8021 = HDR_VLANID8021_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_Hdr8021FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Hdr8021Filter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHdrSrcMACAddr8021() {
		if (hdrSrcMACAddr8021 == null) {
			hdrSrcMACAddr8021 = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_HDR8021_FILTER__HDR_SRC_MAC_ADDR8021);
		}
		return hdrSrcMACAddr8021;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHdrSrcMACMask8021() {
		if (hdrSrcMACMask8021 == null) {
			hdrSrcMACMask8021 = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_HDR8021_FILTER__HDR_SRC_MAC_MASK8021);
		}
		return hdrSrcMACMask8021;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHdrDestMACAddr8021() {
		if (hdrDestMACAddr8021 == null) {
			hdrDestMACAddr8021 = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_HDR8021_FILTER__HDR_DEST_MAC_ADDR8021);
		}
		return hdrDestMACAddr8021;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHdrDestMACMask8021() {
		if (hdrDestMACMask8021 == null) {
			hdrDestMACMask8021 = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_HDR8021_FILTER__HDR_DEST_MAC_MASK8021);
		}
		return hdrDestMACMask8021;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHdrProtocolID8021() {
		return hdrProtocolID8021;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdrProtocolID8021(Integer newHdrProtocolID8021) {
		Integer oldHdrProtocolID8021 = hdrProtocolID8021;
		hdrProtocolID8021 = newHdrProtocolID8021;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_HDR8021_FILTER__HDR_PROTOCOL_ID8021, oldHdrProtocolID8021, hdrProtocolID8021));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHdrPriorityValue8021() {
		return hdrPriorityValue8021;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdrPriorityValue8021(Integer newHdrPriorityValue8021) {
		Integer oldHdrPriorityValue8021 = hdrPriorityValue8021;
		hdrPriorityValue8021 = newHdrPriorityValue8021;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_HDR8021_FILTER__HDR_PRIORITY_VALUE8021, oldHdrPriorityValue8021, hdrPriorityValue8021));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHdrVLANID8021() {
		return hdrVLANID8021;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdrVLANID8021(Long newHdrVLANID8021) {
		Long oldHdrVLANID8021 = hdrVLANID8021;
		hdrVLANID8021 = newHdrVLANID8021;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_HDR8021_FILTER__HDR_VLANID8021, oldHdrVLANID8021, hdrVLANID8021));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_HDR8021_FILTER__HDR_SRC_MAC_ADDR8021:
				return getHdrSrcMACAddr8021();
			case CimPackage.CIM_HDR8021_FILTER__HDR_SRC_MAC_MASK8021:
				return getHdrSrcMACMask8021();
			case CimPackage.CIM_HDR8021_FILTER__HDR_DEST_MAC_ADDR8021:
				return getHdrDestMACAddr8021();
			case CimPackage.CIM_HDR8021_FILTER__HDR_DEST_MAC_MASK8021:
				return getHdrDestMACMask8021();
			case CimPackage.CIM_HDR8021_FILTER__HDR_PROTOCOL_ID8021:
				return getHdrProtocolID8021();
			case CimPackage.CIM_HDR8021_FILTER__HDR_PRIORITY_VALUE8021:
				return getHdrPriorityValue8021();
			case CimPackage.CIM_HDR8021_FILTER__HDR_VLANID8021:
				return getHdrVLANID8021();
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
			case CimPackage.CIM_HDR8021_FILTER__HDR_SRC_MAC_ADDR8021:
				getHdrSrcMACAddr8021().clear();
				getHdrSrcMACAddr8021().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_HDR8021_FILTER__HDR_SRC_MAC_MASK8021:
				getHdrSrcMACMask8021().clear();
				getHdrSrcMACMask8021().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_HDR8021_FILTER__HDR_DEST_MAC_ADDR8021:
				getHdrDestMACAddr8021().clear();
				getHdrDestMACAddr8021().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_HDR8021_FILTER__HDR_DEST_MAC_MASK8021:
				getHdrDestMACMask8021().clear();
				getHdrDestMACMask8021().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_HDR8021_FILTER__HDR_PROTOCOL_ID8021:
				setHdrProtocolID8021((Integer)newValue);
				return;
			case CimPackage.CIM_HDR8021_FILTER__HDR_PRIORITY_VALUE8021:
				setHdrPriorityValue8021((Integer)newValue);
				return;
			case CimPackage.CIM_HDR8021_FILTER__HDR_VLANID8021:
				setHdrVLANID8021((Long)newValue);
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
			case CimPackage.CIM_HDR8021_FILTER__HDR_SRC_MAC_ADDR8021:
				getHdrSrcMACAddr8021().clear();
				return;
			case CimPackage.CIM_HDR8021_FILTER__HDR_SRC_MAC_MASK8021:
				getHdrSrcMACMask8021().clear();
				return;
			case CimPackage.CIM_HDR8021_FILTER__HDR_DEST_MAC_ADDR8021:
				getHdrDestMACAddr8021().clear();
				return;
			case CimPackage.CIM_HDR8021_FILTER__HDR_DEST_MAC_MASK8021:
				getHdrDestMACMask8021().clear();
				return;
			case CimPackage.CIM_HDR8021_FILTER__HDR_PROTOCOL_ID8021:
				setHdrProtocolID8021(HDR_PROTOCOL_ID8021_EDEFAULT);
				return;
			case CimPackage.CIM_HDR8021_FILTER__HDR_PRIORITY_VALUE8021:
				setHdrPriorityValue8021(HDR_PRIORITY_VALUE8021_EDEFAULT);
				return;
			case CimPackage.CIM_HDR8021_FILTER__HDR_VLANID8021:
				setHdrVLANID8021(HDR_VLANID8021_EDEFAULT);
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
			case CimPackage.CIM_HDR8021_FILTER__HDR_SRC_MAC_ADDR8021:
				return hdrSrcMACAddr8021 != null && !hdrSrcMACAddr8021.isEmpty();
			case CimPackage.CIM_HDR8021_FILTER__HDR_SRC_MAC_MASK8021:
				return hdrSrcMACMask8021 != null && !hdrSrcMACMask8021.isEmpty();
			case CimPackage.CIM_HDR8021_FILTER__HDR_DEST_MAC_ADDR8021:
				return hdrDestMACAddr8021 != null && !hdrDestMACAddr8021.isEmpty();
			case CimPackage.CIM_HDR8021_FILTER__HDR_DEST_MAC_MASK8021:
				return hdrDestMACMask8021 != null && !hdrDestMACMask8021.isEmpty();
			case CimPackage.CIM_HDR8021_FILTER__HDR_PROTOCOL_ID8021:
				return HDR_PROTOCOL_ID8021_EDEFAULT == null ? hdrProtocolID8021 != null : !HDR_PROTOCOL_ID8021_EDEFAULT.equals(hdrProtocolID8021);
			case CimPackage.CIM_HDR8021_FILTER__HDR_PRIORITY_VALUE8021:
				return HDR_PRIORITY_VALUE8021_EDEFAULT == null ? hdrPriorityValue8021 != null : !HDR_PRIORITY_VALUE8021_EDEFAULT.equals(hdrPriorityValue8021);
			case CimPackage.CIM_HDR8021_FILTER__HDR_VLANID8021:
				return HDR_VLANID8021_EDEFAULT == null ? hdrVLANID8021 != null : !HDR_VLANID8021_EDEFAULT.equals(hdrVLANID8021);
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
		result.append(" (HdrSrcMACAddr8021: ");
		result.append(hdrSrcMACAddr8021);
		result.append(", HdrSrcMACMask8021: ");
		result.append(hdrSrcMACMask8021);
		result.append(", HdrDestMACAddr8021: ");
		result.append(hdrDestMACAddr8021);
		result.append(", HdrDestMACMask8021: ");
		result.append(hdrDestMACMask8021);
		result.append(", HdrProtocolID8021: ");
		result.append(hdrProtocolID8021);
		result.append(", HdrPriorityValue8021: ");
		result.append(hdrPriorityValue8021);
		result.append(", HdrVLANID8021: ");
		result.append(hdrVLANID8021);
		result.append(')');
		return result.toString();
	}

} //CIM_Hdr8021FilterImpl
