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

import org.dmtf.cim.CIM_CopyFileAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Copy File Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CopyFileActionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CopyFileActionImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CopyFileActionImpl#getDeleteAfterCopy <em>Delete After Copy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CopyFileActionImpl extends CIM_FileActionImpl implements CIM_CopyFileAction {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeleteAfterCopy() <em>Delete After Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteAfterCopy()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETE_AFTER_COPY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeleteAfterCopy() <em>Delete After Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteAfterCopy()
	 * @generated
	 * @ordered
	 */
	protected Boolean deleteAfterCopy = DELETE_AFTER_COPY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CopyFileActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CopyFileAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COPY_FILE_ACTION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COPY_FILE_ACTION__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeleteAfterCopy() {
		return deleteAfterCopy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteAfterCopy(Boolean newDeleteAfterCopy) {
		Boolean oldDeleteAfterCopy = deleteAfterCopy;
		deleteAfterCopy = newDeleteAfterCopy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COPY_FILE_ACTION__DELETE_AFTER_COPY, oldDeleteAfterCopy, deleteAfterCopy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COPY_FILE_ACTION__SOURCE:
				return getSource();
			case CimPackage.CIM_COPY_FILE_ACTION__DESTINATION:
				return getDestination();
			case CimPackage.CIM_COPY_FILE_ACTION__DELETE_AFTER_COPY:
				return getDeleteAfterCopy();
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
			case CimPackage.CIM_COPY_FILE_ACTION__SOURCE:
				setSource((String)newValue);
				return;
			case CimPackage.CIM_COPY_FILE_ACTION__DESTINATION:
				setDestination((String)newValue);
				return;
			case CimPackage.CIM_COPY_FILE_ACTION__DELETE_AFTER_COPY:
				setDeleteAfterCopy((Boolean)newValue);
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
			case CimPackage.CIM_COPY_FILE_ACTION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CimPackage.CIM_COPY_FILE_ACTION__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case CimPackage.CIM_COPY_FILE_ACTION__DELETE_AFTER_COPY:
				setDeleteAfterCopy(DELETE_AFTER_COPY_EDEFAULT);
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
			case CimPackage.CIM_COPY_FILE_ACTION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case CimPackage.CIM_COPY_FILE_ACTION__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case CimPackage.CIM_COPY_FILE_ACTION__DELETE_AFTER_COPY:
				return DELETE_AFTER_COPY_EDEFAULT == null ? deleteAfterCopy != null : !DELETE_AFTER_COPY_EDEFAULT.equals(deleteAfterCopy);
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
		result.append(" (Source: ");
		result.append(source);
		result.append(", Destination: ");
		result.append(destination);
		result.append(", DeleteAfterCopy: ");
		result.append(deleteAfterCopy);
		result.append(')');
		return result.toString();
	}

} //CIM_CopyFileActionImpl
