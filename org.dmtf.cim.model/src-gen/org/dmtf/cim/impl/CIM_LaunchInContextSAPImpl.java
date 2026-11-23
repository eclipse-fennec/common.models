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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_LaunchInContextSAP;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Launch In Context SAP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextSAPImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextSAPImpl#getParameterDescription <em>Parameter Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextSAPImpl#getParameterDerivation <em>Parameter Derivation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextSAPImpl#getParameterConstraints <em>Parameter Constraints</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextSAPImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextSAPImpl#getSupportedFeatureName <em>Supported Feature Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextSAPImpl#getSupportedFeatureDescription <em>Supported Feature Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextSAPImpl#getManagedClasses <em>Managed Classes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextSAPImpl#getManagementIsRestricted <em>Management Is Restricted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextSAPImpl#getLaunchMessage <em>Launch Message</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LaunchInContextSAPImpl#getLaunchMessageProtocolOperation <em>Launch Message Protocol Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LaunchInContextSAPImpl extends CIM_RemoteServiceAccessPointImpl implements CIM_LaunchInContextSAP {
	/**
	 * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameterName;

	/**
	 * The cached value of the '{@link #getParameterDescription() <em>Parameter Description</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameterDescription;

	/**
	 * The cached value of the '{@link #getParameterDerivation() <em>Parameter Derivation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDerivation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameterDerivation;

	/**
	 * The cached value of the '{@link #getParameterConstraints() <em>Parameter Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameterConstraints;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> parameterType;

	/**
	 * The cached value of the '{@link #getSupportedFeatureName() <em>Supported Feature Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFeatureName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedFeatureName;

	/**
	 * The cached value of the '{@link #getSupportedFeatureDescription() <em>Supported Feature Description</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFeatureDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedFeatureDescription;

	/**
	 * The cached value of the '{@link #getManagedClasses() <em>Managed Classes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> managedClasses;

	/**
	 * The default value of the '{@link #getManagementIsRestricted() <em>Management Is Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementIsRestricted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MANAGEMENT_IS_RESTRICTED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getManagementIsRestricted() <em>Management Is Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementIsRestricted()
	 * @generated
	 * @ordered
	 */
	protected Boolean managementIsRestricted = MANAGEMENT_IS_RESTRICTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLaunchMessage() <em>Launch Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String LAUNCH_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLaunchMessage() <em>Launch Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchMessage()
	 * @generated
	 * @ordered
	 */
	protected String launchMessage = LAUNCH_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLaunchMessageProtocolOperation() <em>Launch Message Protocol Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchMessageProtocolOperation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAUNCH_MESSAGE_PROTOCOL_OPERATION_EDEFAULT = Integer.valueOf(3);

	/**
	 * The cached value of the '{@link #getLaunchMessageProtocolOperation() <em>Launch Message Protocol Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchMessageProtocolOperation()
	 * @generated
	 * @ordered
	 */
	protected Integer launchMessageProtocolOperation = LAUNCH_MESSAGE_PROTOCOL_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LaunchInContextSAPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LaunchInContextSAP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getParameterName() {
		if (parameterName == null) {
			parameterName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_NAME);
		}
		return parameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getParameterDescription() {
		if (parameterDescription == null) {
			parameterDescription = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_DESCRIPTION);
		}
		return parameterDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getParameterDerivation() {
		if (parameterDerivation == null) {
			parameterDerivation = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_DERIVATION);
		}
		return parameterDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getParameterConstraints() {
		if (parameterConstraints == null) {
			parameterConstraints = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_CONSTRAINTS);
		}
		return parameterConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getParameterType() {
		if (parameterType == null) {
			parameterType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_TYPE);
		}
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSupportedFeatureName() {
		if (supportedFeatureName == null) {
			supportedFeatureName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__SUPPORTED_FEATURE_NAME);
		}
		return supportedFeatureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSupportedFeatureDescription() {
		if (supportedFeatureDescription == null) {
			supportedFeatureDescription = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__SUPPORTED_FEATURE_DESCRIPTION);
		}
		return supportedFeatureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getManagedClasses() {
		if (managedClasses == null) {
			managedClasses = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__MANAGED_CLASSES);
		}
		return managedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getManagementIsRestricted() {
		return managementIsRestricted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagementIsRestricted(Boolean newManagementIsRestricted) {
		Boolean oldManagementIsRestricted = managementIsRestricted;
		managementIsRestricted = newManagementIsRestricted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__MANAGEMENT_IS_RESTRICTED, oldManagementIsRestricted, managementIsRestricted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLaunchMessage() {
		return launchMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaunchMessage(String newLaunchMessage) {
		String oldLaunchMessage = launchMessage;
		launchMessage = newLaunchMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__LAUNCH_MESSAGE, oldLaunchMessage, launchMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLaunchMessageProtocolOperation() {
		return launchMessageProtocolOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaunchMessageProtocolOperation(Integer newLaunchMessageProtocolOperation) {
		Integer oldLaunchMessageProtocolOperation = launchMessageProtocolOperation;
		launchMessageProtocolOperation = newLaunchMessageProtocolOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__LAUNCH_MESSAGE_PROTOCOL_OPERATION, oldLaunchMessageProtocolOperation, launchMessageProtocolOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetDerivedParametersForElement(CIM_ManagedElement Self, EList<String> ParameterValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_NAME:
				return getParameterName();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_DESCRIPTION:
				return getParameterDescription();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_DERIVATION:
				return getParameterDerivation();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_CONSTRAINTS:
				return getParameterConstraints();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_TYPE:
				return getParameterType();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__SUPPORTED_FEATURE_NAME:
				return getSupportedFeatureName();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__SUPPORTED_FEATURE_DESCRIPTION:
				return getSupportedFeatureDescription();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__MANAGED_CLASSES:
				return getManagedClasses();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__MANAGEMENT_IS_RESTRICTED:
				return getManagementIsRestricted();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__LAUNCH_MESSAGE:
				return getLaunchMessage();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__LAUNCH_MESSAGE_PROTOCOL_OPERATION:
				return getLaunchMessageProtocolOperation();
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
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_NAME:
				getParameterName().clear();
				getParameterName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_DESCRIPTION:
				getParameterDescription().clear();
				getParameterDescription().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_DERIVATION:
				getParameterDerivation().clear();
				getParameterDerivation().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_CONSTRAINTS:
				getParameterConstraints().clear();
				getParameterConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_TYPE:
				getParameterType().clear();
				getParameterType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__SUPPORTED_FEATURE_NAME:
				getSupportedFeatureName().clear();
				getSupportedFeatureName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__SUPPORTED_FEATURE_DESCRIPTION:
				getSupportedFeatureDescription().clear();
				getSupportedFeatureDescription().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__MANAGED_CLASSES:
				getManagedClasses().clear();
				getManagedClasses().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__MANAGEMENT_IS_RESTRICTED:
				setManagementIsRestricted((Boolean)newValue);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__LAUNCH_MESSAGE:
				setLaunchMessage((String)newValue);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__LAUNCH_MESSAGE_PROTOCOL_OPERATION:
				setLaunchMessageProtocolOperation((Integer)newValue);
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
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_NAME:
				getParameterName().clear();
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_DESCRIPTION:
				getParameterDescription().clear();
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_DERIVATION:
				getParameterDerivation().clear();
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_CONSTRAINTS:
				getParameterConstraints().clear();
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_TYPE:
				getParameterType().clear();
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__SUPPORTED_FEATURE_NAME:
				getSupportedFeatureName().clear();
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__SUPPORTED_FEATURE_DESCRIPTION:
				getSupportedFeatureDescription().clear();
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__MANAGED_CLASSES:
				getManagedClasses().clear();
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__MANAGEMENT_IS_RESTRICTED:
				setManagementIsRestricted(MANAGEMENT_IS_RESTRICTED_EDEFAULT);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__LAUNCH_MESSAGE:
				setLaunchMessage(LAUNCH_MESSAGE_EDEFAULT);
				return;
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__LAUNCH_MESSAGE_PROTOCOL_OPERATION:
				setLaunchMessageProtocolOperation(LAUNCH_MESSAGE_PROTOCOL_OPERATION_EDEFAULT);
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
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_NAME:
				return parameterName != null && !parameterName.isEmpty();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_DESCRIPTION:
				return parameterDescription != null && !parameterDescription.isEmpty();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_DERIVATION:
				return parameterDerivation != null && !parameterDerivation.isEmpty();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_CONSTRAINTS:
				return parameterConstraints != null && !parameterConstraints.isEmpty();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__PARAMETER_TYPE:
				return parameterType != null && !parameterType.isEmpty();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__SUPPORTED_FEATURE_NAME:
				return supportedFeatureName != null && !supportedFeatureName.isEmpty();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__SUPPORTED_FEATURE_DESCRIPTION:
				return supportedFeatureDescription != null && !supportedFeatureDescription.isEmpty();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__MANAGED_CLASSES:
				return managedClasses != null && !managedClasses.isEmpty();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__MANAGEMENT_IS_RESTRICTED:
				return MANAGEMENT_IS_RESTRICTED_EDEFAULT == null ? managementIsRestricted != null : !MANAGEMENT_IS_RESTRICTED_EDEFAULT.equals(managementIsRestricted);
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__LAUNCH_MESSAGE:
				return LAUNCH_MESSAGE_EDEFAULT == null ? launchMessage != null : !LAUNCH_MESSAGE_EDEFAULT.equals(launchMessage);
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP__LAUNCH_MESSAGE_PROTOCOL_OPERATION:
				return LAUNCH_MESSAGE_PROTOCOL_OPERATION_EDEFAULT == null ? launchMessageProtocolOperation != null : !LAUNCH_MESSAGE_PROTOCOL_OPERATION_EDEFAULT.equals(launchMessageProtocolOperation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP___GET_DERIVED_PARAMETERS_FOR_ELEMENT__CIM_MANAGEDELEMENT_ELIST:
				return GetDerivedParametersForElement((CIM_ManagedElement)arguments.get(0), (EList<String>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (ParameterName: ");
		result.append(parameterName);
		result.append(", ParameterDescription: ");
		result.append(parameterDescription);
		result.append(", ParameterDerivation: ");
		result.append(parameterDerivation);
		result.append(", ParameterConstraints: ");
		result.append(parameterConstraints);
		result.append(", ParameterType: ");
		result.append(parameterType);
		result.append(", SupportedFeatureName: ");
		result.append(supportedFeatureName);
		result.append(", SupportedFeatureDescription: ");
		result.append(supportedFeatureDescription);
		result.append(", ManagedClasses: ");
		result.append(managedClasses);
		result.append(", ManagementIsRestricted: ");
		result.append(managementIsRestricted);
		result.append(", LaunchMessage: ");
		result.append(launchMessage);
		result.append(", LaunchMessageProtocolOperation: ");
		result.append(launchMessageProtocolOperation);
		result.append(')');
		return result.toString();
	}

} //CIM_LaunchInContextSAPImpl
