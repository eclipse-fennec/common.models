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

import org.dmtf.cim.CIM_VTOCDiskPartition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM VTOC Disk Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTOCDiskPartitionImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTOCDiskPartitionImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTOCDiskPartitionImpl#getAsciiLabel <em>Ascii Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VTOCDiskPartitionImpl extends CIM_GenericDiskPartitionImpl implements CIM_VTOCDiskPartition {
	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> flags;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected Integer tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsciiLabel() <em>Ascii Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsciiLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ASCII_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsciiLabel() <em>Ascii Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsciiLabel()
	 * @generated
	 * @ordered
	 */
	protected String asciiLabel = ASCII_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VTOCDiskPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VTOCDiskPartition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getFlags() {
		if (flags == null) {
			flags = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VTOC_DISK_PARTITION__FLAGS);
		}
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(Integer newTag) {
		Integer oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTOC_DISK_PARTITION__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAsciiLabel() {
		return asciiLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsciiLabel(String newAsciiLabel) {
		String oldAsciiLabel = asciiLabel;
		asciiLabel = newAsciiLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTOC_DISK_PARTITION__ASCII_LABEL, oldAsciiLabel, asciiLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VTOC_DISK_PARTITION__FLAGS:
				return getFlags();
			case CimPackage.CIM_VTOC_DISK_PARTITION__TAG:
				return getTag();
			case CimPackage.CIM_VTOC_DISK_PARTITION__ASCII_LABEL:
				return getAsciiLabel();
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
			case CimPackage.CIM_VTOC_DISK_PARTITION__FLAGS:
				getFlags().clear();
				getFlags().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_VTOC_DISK_PARTITION__TAG:
				setTag((Integer)newValue);
				return;
			case CimPackage.CIM_VTOC_DISK_PARTITION__ASCII_LABEL:
				setAsciiLabel((String)newValue);
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
			case CimPackage.CIM_VTOC_DISK_PARTITION__FLAGS:
				getFlags().clear();
				return;
			case CimPackage.CIM_VTOC_DISK_PARTITION__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case CimPackage.CIM_VTOC_DISK_PARTITION__ASCII_LABEL:
				setAsciiLabel(ASCII_LABEL_EDEFAULT);
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
			case CimPackage.CIM_VTOC_DISK_PARTITION__FLAGS:
				return flags != null && !flags.isEmpty();
			case CimPackage.CIM_VTOC_DISK_PARTITION__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case CimPackage.CIM_VTOC_DISK_PARTITION__ASCII_LABEL:
				return ASCII_LABEL_EDEFAULT == null ? asciiLabel != null : !ASCII_LABEL_EDEFAULT.equals(asciiLabel);
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
		result.append(" (Flags: ");
		result.append(flags);
		result.append(", Tag: ");
		result.append(tag);
		result.append(", AsciiLabel: ");
		result.append(asciiLabel);
		result.append(')');
		return result.toString();
	}

} //CIM_VTOCDiskPartitionImpl
