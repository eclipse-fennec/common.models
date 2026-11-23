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

import org.dmtf.cim.CIM_GenericOperationCapabilitiesStructure;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Generic Operation Capabilities Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_GenericOperationCapabilitiesStructureImpl#getFQLSupported <em>FQL Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_GenericOperationCapabilitiesStructureImpl#getCQLSupport <em>CQL Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_GenericOperationCapabilitiesStructureImpl#getOperationsSupported <em>Operations Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_GenericOperationCapabilitiesStructureImpl#getOtherOperationsSupportedDescriptions <em>Other Operations Supported Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_GenericOperationCapabilitiesStructureImpl#getContinueOnErrorSupported <em>Continue On Error Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_GenericOperationCapabilitiesStructureImpl#getMinimumOperationTimeout <em>Minimum Operation Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_GenericOperationCapabilitiesStructureImpl#getMaximumOperationTimeout <em>Maximum Operation Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_GenericOperationCapabilitiesStructureImpl extends MinimalEObjectImpl.Container implements CIM_GenericOperationCapabilitiesStructure {
	/**
	 * The default value of the '{@link #getFQLSupported() <em>FQL Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFQLSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FQL_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFQLSupported() <em>FQL Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFQLSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean fqlSupported = FQL_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCQLSupport() <em>CQL Support</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCQLSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> cqlSupport;

	/**
	 * The cached value of the '{@link #getOperationsSupported() <em>Operations Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> operationsSupported;

	/**
	 * The cached value of the '{@link #getOtherOperationsSupportedDescriptions() <em>Other Operations Supported Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherOperationsSupportedDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherOperationsSupportedDescriptions;

	/**
	 * The default value of the '{@link #getContinueOnErrorSupported() <em>Continue On Error Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinueOnErrorSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTINUE_ON_ERROR_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContinueOnErrorSupported() <em>Continue On Error Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinueOnErrorSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean continueOnErrorSupported = CONTINUE_ON_ERROR_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumOperationTimeout() <em>Minimum Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOperationTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Long MINIMUM_OPERATION_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumOperationTimeout() <em>Minimum Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOperationTimeout()
	 * @generated
	 * @ordered
	 */
	protected Long minimumOperationTimeout = MINIMUM_OPERATION_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumOperationTimeout() <em>Maximum Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOperationTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAXIMUM_OPERATION_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumOperationTimeout() <em>Maximum Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOperationTimeout()
	 * @generated
	 * @ordered
	 */
	protected Long maximumOperationTimeout = MAXIMUM_OPERATION_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_GenericOperationCapabilitiesStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_GenericOperationCapabilitiesStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFQLSupported() {
		return fqlSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFQLSupported(Boolean newFQLSupported) {
		Boolean oldFQLSupported = fqlSupported;
		fqlSupported = newFQLSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__FQL_SUPPORTED, oldFQLSupported, fqlSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getCQLSupport() {
		if (cqlSupport == null) {
			cqlSupport = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__CQL_SUPPORT);
		}
		return cqlSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getOperationsSupported() {
		if (operationsSupported == null) {
			operationsSupported = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__OPERATIONS_SUPPORTED);
		}
		return operationsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherOperationsSupportedDescriptions() {
		if (otherOperationsSupportedDescriptions == null) {
			otherOperationsSupportedDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__OTHER_OPERATIONS_SUPPORTED_DESCRIPTIONS);
		}
		return otherOperationsSupportedDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getContinueOnErrorSupported() {
		return continueOnErrorSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContinueOnErrorSupported(Boolean newContinueOnErrorSupported) {
		Boolean oldContinueOnErrorSupported = continueOnErrorSupported;
		continueOnErrorSupported = newContinueOnErrorSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__CONTINUE_ON_ERROR_SUPPORTED, oldContinueOnErrorSupported, continueOnErrorSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinimumOperationTimeout() {
		return minimumOperationTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumOperationTimeout(Long newMinimumOperationTimeout) {
		Long oldMinimumOperationTimeout = minimumOperationTimeout;
		minimumOperationTimeout = newMinimumOperationTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__MINIMUM_OPERATION_TIMEOUT, oldMinimumOperationTimeout, minimumOperationTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaximumOperationTimeout() {
		return maximumOperationTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumOperationTimeout(Long newMaximumOperationTimeout) {
		Long oldMaximumOperationTimeout = maximumOperationTimeout;
		maximumOperationTimeout = newMaximumOperationTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__MAXIMUM_OPERATION_TIMEOUT, oldMaximumOperationTimeout, maximumOperationTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__FQL_SUPPORTED:
				return getFQLSupported();
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__CQL_SUPPORT:
				return getCQLSupport();
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__OPERATIONS_SUPPORTED:
				return getOperationsSupported();
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__OTHER_OPERATIONS_SUPPORTED_DESCRIPTIONS:
				return getOtherOperationsSupportedDescriptions();
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__CONTINUE_ON_ERROR_SUPPORTED:
				return getContinueOnErrorSupported();
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__MINIMUM_OPERATION_TIMEOUT:
				return getMinimumOperationTimeout();
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__MAXIMUM_OPERATION_TIMEOUT:
				return getMaximumOperationTimeout();
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
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__FQL_SUPPORTED:
				setFQLSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__CQL_SUPPORT:
				getCQLSupport().clear();
				getCQLSupport().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__OPERATIONS_SUPPORTED:
				getOperationsSupported().clear();
				getOperationsSupported().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__OTHER_OPERATIONS_SUPPORTED_DESCRIPTIONS:
				getOtherOperationsSupportedDescriptions().clear();
				getOtherOperationsSupportedDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__CONTINUE_ON_ERROR_SUPPORTED:
				setContinueOnErrorSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__MINIMUM_OPERATION_TIMEOUT:
				setMinimumOperationTimeout((Long)newValue);
				return;
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__MAXIMUM_OPERATION_TIMEOUT:
				setMaximumOperationTimeout((Long)newValue);
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
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__FQL_SUPPORTED:
				setFQLSupported(FQL_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__CQL_SUPPORT:
				getCQLSupport().clear();
				return;
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__OPERATIONS_SUPPORTED:
				getOperationsSupported().clear();
				return;
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__OTHER_OPERATIONS_SUPPORTED_DESCRIPTIONS:
				getOtherOperationsSupportedDescriptions().clear();
				return;
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__CONTINUE_ON_ERROR_SUPPORTED:
				setContinueOnErrorSupported(CONTINUE_ON_ERROR_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__MINIMUM_OPERATION_TIMEOUT:
				setMinimumOperationTimeout(MINIMUM_OPERATION_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__MAXIMUM_OPERATION_TIMEOUT:
				setMaximumOperationTimeout(MAXIMUM_OPERATION_TIMEOUT_EDEFAULT);
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
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__FQL_SUPPORTED:
				return FQL_SUPPORTED_EDEFAULT == null ? fqlSupported != null : !FQL_SUPPORTED_EDEFAULT.equals(fqlSupported);
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__CQL_SUPPORT:
				return cqlSupport != null && !cqlSupport.isEmpty();
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__OPERATIONS_SUPPORTED:
				return operationsSupported != null && !operationsSupported.isEmpty();
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__OTHER_OPERATIONS_SUPPORTED_DESCRIPTIONS:
				return otherOperationsSupportedDescriptions != null && !otherOperationsSupportedDescriptions.isEmpty();
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__CONTINUE_ON_ERROR_SUPPORTED:
				return CONTINUE_ON_ERROR_SUPPORTED_EDEFAULT == null ? continueOnErrorSupported != null : !CONTINUE_ON_ERROR_SUPPORTED_EDEFAULT.equals(continueOnErrorSupported);
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__MINIMUM_OPERATION_TIMEOUT:
				return MINIMUM_OPERATION_TIMEOUT_EDEFAULT == null ? minimumOperationTimeout != null : !MINIMUM_OPERATION_TIMEOUT_EDEFAULT.equals(minimumOperationTimeout);
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE__MAXIMUM_OPERATION_TIMEOUT:
				return MAXIMUM_OPERATION_TIMEOUT_EDEFAULT == null ? maximumOperationTimeout != null : !MAXIMUM_OPERATION_TIMEOUT_EDEFAULT.equals(maximumOperationTimeout);
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
		result.append(" (FQLSupported: ");
		result.append(fqlSupported);
		result.append(", CQLSupport: ");
		result.append(cqlSupport);
		result.append(", OperationsSupported: ");
		result.append(operationsSupported);
		result.append(", OtherOperationsSupportedDescriptions: ");
		result.append(otherOperationsSupportedDescriptions);
		result.append(", ContinueOnErrorSupported: ");
		result.append(continueOnErrorSupported);
		result.append(", MinimumOperationTimeout: ");
		result.append(minimumOperationTimeout);
		result.append(", MaximumOperationTimeout: ");
		result.append(maximumOperationTimeout);
		result.append(')');
		return result.toString();
	}

} //CIM_GenericOperationCapabilitiesStructureImpl
