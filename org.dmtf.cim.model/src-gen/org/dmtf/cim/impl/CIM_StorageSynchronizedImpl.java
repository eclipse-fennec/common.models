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

import org.dmtf.cim.CIM_StorageSynchronized;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Synchronized</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSynchronizedImpl#getCopyType <em>Copy Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSynchronizedImpl#getReplicaType <em>Replica Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSynchronizedImpl#getSyncState <em>Sync State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSynchronizedImpl#getCopyMethodology <em>Copy Methodology</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSynchronizedImpl#getCopyPriority <em>Copy Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSynchronizedImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSynchronizedImpl#getUndiscoveredElement <em>Undiscovered Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageSynchronizedImpl extends CIM_SynchronizedImpl implements CIM_StorageSynchronized {
	/**
	 * The default value of the '{@link #getCopyType() <em>Copy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COPY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyType() <em>Copy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyType()
	 * @generated
	 * @ordered
	 */
	protected Integer copyType = COPY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicaType() <em>Replica Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicaType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REPLICA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplicaType() <em>Replica Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicaType()
	 * @generated
	 * @ordered
	 */
	protected Integer replicaType = REPLICA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyncState() <em>Sync State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SYNC_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyncState() <em>Sync State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncState()
	 * @generated
	 * @ordered
	 */
	protected Integer syncState = SYNC_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyMethodology() <em>Copy Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyMethodology()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COPY_METHODOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyMethodology() <em>Copy Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyMethodology()
	 * @generated
	 * @ordered
	 */
	protected Integer copyMethodology = COPY_METHODOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyPriority() <em>Copy Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COPY_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyPriority() <em>Copy Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer copyPriority = COPY_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Integer READ_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Integer readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUndiscoveredElement() <em>Undiscovered Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndiscoveredElement()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UNDISCOVERED_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUndiscoveredElement() <em>Undiscovered Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndiscoveredElement()
	 * @generated
	 * @ordered
	 */
	protected Integer undiscoveredElement = UNDISCOVERED_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageSynchronizedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageSynchronized();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCopyType() {
		return copyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyType(Integer newCopyType) {
		Integer oldCopyType = copyType;
		copyType = newCopyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_TYPE, oldCopyType, copyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReplicaType() {
		return replicaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicaType(Integer newReplicaType) {
		Integer oldReplicaType = replicaType;
		replicaType = newReplicaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SYNCHRONIZED__REPLICA_TYPE, oldReplicaType, replicaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSyncState() {
		return syncState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncState(Integer newSyncState) {
		Integer oldSyncState = syncState;
		syncState = newSyncState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SYNCHRONIZED__SYNC_STATE, oldSyncState, syncState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCopyMethodology() {
		return copyMethodology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyMethodology(Integer newCopyMethodology) {
		Integer oldCopyMethodology = copyMethodology;
		copyMethodology = newCopyMethodology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_METHODOLOGY, oldCopyMethodology, copyMethodology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCopyPriority() {
		return copyPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyPriority(Integer newCopyPriority) {
		Integer oldCopyPriority = copyPriority;
		copyPriority = newCopyPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_PRIORITY, oldCopyPriority, copyPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(Integer newReadOnly) {
		Integer oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SYNCHRONIZED__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUndiscoveredElement() {
		return undiscoveredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUndiscoveredElement(Integer newUndiscoveredElement) {
		Integer oldUndiscoveredElement = undiscoveredElement;
		undiscoveredElement = newUndiscoveredElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SYNCHRONIZED__UNDISCOVERED_ELEMENT, oldUndiscoveredElement, undiscoveredElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_TYPE:
				return getCopyType();
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__REPLICA_TYPE:
				return getReplicaType();
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__SYNC_STATE:
				return getSyncState();
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_METHODOLOGY:
				return getCopyMethodology();
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_PRIORITY:
				return getCopyPriority();
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__READ_ONLY:
				return getReadOnly();
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__UNDISCOVERED_ELEMENT:
				return getUndiscoveredElement();
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
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_TYPE:
				setCopyType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__REPLICA_TYPE:
				setReplicaType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__SYNC_STATE:
				setSyncState((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_METHODOLOGY:
				setCopyMethodology((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_PRIORITY:
				setCopyPriority((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__READ_ONLY:
				setReadOnly((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__UNDISCOVERED_ELEMENT:
				setUndiscoveredElement((Integer)newValue);
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
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_TYPE:
				setCopyType(COPY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__REPLICA_TYPE:
				setReplicaType(REPLICA_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__SYNC_STATE:
				setSyncState(SYNC_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_METHODOLOGY:
				setCopyMethodology(COPY_METHODOLOGY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_PRIORITY:
				setCopyPriority(COPY_PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__UNDISCOVERED_ELEMENT:
				setUndiscoveredElement(UNDISCOVERED_ELEMENT_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_TYPE:
				return COPY_TYPE_EDEFAULT == null ? copyType != null : !COPY_TYPE_EDEFAULT.equals(copyType);
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__REPLICA_TYPE:
				return REPLICA_TYPE_EDEFAULT == null ? replicaType != null : !REPLICA_TYPE_EDEFAULT.equals(replicaType);
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__SYNC_STATE:
				return SYNC_STATE_EDEFAULT == null ? syncState != null : !SYNC_STATE_EDEFAULT.equals(syncState);
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_METHODOLOGY:
				return COPY_METHODOLOGY_EDEFAULT == null ? copyMethodology != null : !COPY_METHODOLOGY_EDEFAULT.equals(copyMethodology);
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__COPY_PRIORITY:
				return COPY_PRIORITY_EDEFAULT == null ? copyPriority != null : !COPY_PRIORITY_EDEFAULT.equals(copyPriority);
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__READ_ONLY:
				return READ_ONLY_EDEFAULT == null ? readOnly != null : !READ_ONLY_EDEFAULT.equals(readOnly);
			case CimPackage.CIM_STORAGE_SYNCHRONIZED__UNDISCOVERED_ELEMENT:
				return UNDISCOVERED_ELEMENT_EDEFAULT == null ? undiscoveredElement != null : !UNDISCOVERED_ELEMENT_EDEFAULT.equals(undiscoveredElement);
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
		result.append(" (CopyType: ");
		result.append(copyType);
		result.append(", ReplicaType: ");
		result.append(replicaType);
		result.append(", SyncState: ");
		result.append(syncState);
		result.append(", CopyMethodology: ");
		result.append(copyMethodology);
		result.append(", CopyPriority: ");
		result.append(copyPriority);
		result.append(", ReadOnly: ");
		result.append(readOnly);
		result.append(", UndiscoveredElement: ");
		result.append(undiscoveredElement);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageSynchronizedImpl
