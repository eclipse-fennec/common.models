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

import org.dmtf.cim.CIM_InstIndication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Inst Indication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstIndicationImpl#getSourceInstance <em>Source Instance</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstIndicationImpl#getSourceInstanceModelPath <em>Source Instance Model Path</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstIndicationImpl#getSourceInstanceHost <em>Source Instance Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_InstIndicationImpl extends CIM_IndicationImpl implements CIM_InstIndication {
	/**
	 * The default value of the '{@link #getSourceInstance() <em>Source Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceInstance() <em>Source Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceInstance()
	 * @generated
	 * @ordered
	 */
	protected String sourceInstance = SOURCE_INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceInstanceModelPath() <em>Source Instance Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceInstanceModelPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_INSTANCE_MODEL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceInstanceModelPath() <em>Source Instance Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceInstanceModelPath()
	 * @generated
	 * @ordered
	 */
	protected String sourceInstanceModelPath = SOURCE_INSTANCE_MODEL_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceInstanceHost() <em>Source Instance Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceInstanceHost()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_INSTANCE_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceInstanceHost() <em>Source Instance Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceInstanceHost()
	 * @generated
	 * @ordered
	 */
	protected String sourceInstanceHost = SOURCE_INSTANCE_HOST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_InstIndicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_InstIndication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceInstance() {
		return sourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceInstance(String newSourceInstance) {
		String oldSourceInstance = sourceInstance;
		sourceInstance = newSourceInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE, oldSourceInstance, sourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceInstanceModelPath() {
		return sourceInstanceModelPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceInstanceModelPath(String newSourceInstanceModelPath) {
		String oldSourceInstanceModelPath = sourceInstanceModelPath;
		sourceInstanceModelPath = newSourceInstanceModelPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE_MODEL_PATH, oldSourceInstanceModelPath, sourceInstanceModelPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceInstanceHost() {
		return sourceInstanceHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceInstanceHost(String newSourceInstanceHost) {
		String oldSourceInstanceHost = sourceInstanceHost;
		sourceInstanceHost = newSourceInstanceHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE_HOST, oldSourceInstanceHost, sourceInstanceHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE:
				return getSourceInstance();
			case CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE_MODEL_PATH:
				return getSourceInstanceModelPath();
			case CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE_HOST:
				return getSourceInstanceHost();
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
			case CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE:
				setSourceInstance((String)newValue);
				return;
			case CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE_MODEL_PATH:
				setSourceInstanceModelPath((String)newValue);
				return;
			case CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE_HOST:
				setSourceInstanceHost((String)newValue);
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
			case CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE:
				setSourceInstance(SOURCE_INSTANCE_EDEFAULT);
				return;
			case CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE_MODEL_PATH:
				setSourceInstanceModelPath(SOURCE_INSTANCE_MODEL_PATH_EDEFAULT);
				return;
			case CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE_HOST:
				setSourceInstanceHost(SOURCE_INSTANCE_HOST_EDEFAULT);
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
			case CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE:
				return SOURCE_INSTANCE_EDEFAULT == null ? sourceInstance != null : !SOURCE_INSTANCE_EDEFAULT.equals(sourceInstance);
			case CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE_MODEL_PATH:
				return SOURCE_INSTANCE_MODEL_PATH_EDEFAULT == null ? sourceInstanceModelPath != null : !SOURCE_INSTANCE_MODEL_PATH_EDEFAULT.equals(sourceInstanceModelPath);
			case CimPackage.CIM_INST_INDICATION__SOURCE_INSTANCE_HOST:
				return SOURCE_INSTANCE_HOST_EDEFAULT == null ? sourceInstanceHost != null : !SOURCE_INSTANCE_HOST_EDEFAULT.equals(sourceInstanceHost);
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
		result.append(" (SourceInstance: ");
		result.append(sourceInstance);
		result.append(", SourceInstanceModelPath: ");
		result.append(sourceInstanceModelPath);
		result.append(", SourceInstanceHost: ");
		result.append(sourceInstanceHost);
		result.append(')');
		return result.toString();
	}

} //CIM_InstIndicationImpl
