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

import org.dmtf.cim.CIM_UnitOfWorkDefinition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unit Of Work Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitOfWorkDefinitionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitOfWorkDefinitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitOfWorkDefinitionImpl#getTraceLevelTypeId <em>Trace Level Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnitOfWorkDefinitionImpl extends CIM_LogicalElementImpl implements CIM_UnitOfWorkDefinition {
	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceLevelTypeId() <em>Trace Level Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLevelTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_LEVEL_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceLevelTypeId() <em>Trace Level Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLevelTypeId()
	 * @generated
	 * @ordered
	 */
	protected String traceLevelTypeId = TRACE_LEVEL_TYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnitOfWorkDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UnitOfWorkDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIT_OF_WORK_DEFINITION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIT_OF_WORK_DEFINITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTraceLevelTypeId() {
		return traceLevelTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTraceLevelTypeId(String newTraceLevelTypeId) {
		String oldTraceLevelTypeId = traceLevelTypeId;
		traceLevelTypeId = newTraceLevelTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIT_OF_WORK_DEFINITION__TRACE_LEVEL_TYPE_ID, oldTraceLevelTypeId, traceLevelTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION__CONTEXT:
				return getContext();
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION__ID:
				return getId();
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION__TRACE_LEVEL_TYPE_ID:
				return getTraceLevelTypeId();
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
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION__CONTEXT:
				setContext((String)newValue);
				return;
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION__ID:
				setId((String)newValue);
				return;
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION__TRACE_LEVEL_TYPE_ID:
				setTraceLevelTypeId((String)newValue);
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
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION__ID:
				setId(ID_EDEFAULT);
				return;
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION__TRACE_LEVEL_TYPE_ID:
				setTraceLevelTypeId(TRACE_LEVEL_TYPE_ID_EDEFAULT);
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
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION__TRACE_LEVEL_TYPE_ID:
				return TRACE_LEVEL_TYPE_ID_EDEFAULT == null ? traceLevelTypeId != null : !TRACE_LEVEL_TYPE_ID_EDEFAULT.equals(traceLevelTypeId);
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
		result.append(" (Context: ");
		result.append(context);
		result.append(", Id: ");
		result.append(id);
		result.append(", TraceLevelTypeId: ");
		result.append(traceLevelTypeId);
		result.append(')');
		return result.toString();
	}

} //CIM_UnitOfWorkDefinitionImpl
