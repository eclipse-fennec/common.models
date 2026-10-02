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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.BackMatter;
import gov.nist.csrc.ns.oscal.Capability;
import gov.nist.csrc.ns.oscal.ComponentDefinition;
import gov.nist.csrc.ns.oscal.DefinedComponent;
import gov.nist.csrc.ns.oscal.ImportComponentDefinition;
import gov.nist.csrc.ns.oscal.Metadata;
import gov.nist.csrc.ns.oscal.OSCALPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentDefinitionImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentDefinitionImpl#getImportComponentDefinition <em>Import Component Definition</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentDefinitionImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentDefinitionImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentDefinitionImpl#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentDefinitionImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDefinitionImpl extends MinimalEObjectImpl.Container implements ComponentDefinition {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * The cached value of the '{@link #getImportComponentDefinition() <em>Import Component Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportComponentDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportComponentDefinition> importComponentDefinition;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinedComponent> component;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capability;

	/**
	 * The cached value of the '{@link #getBackMatter() <em>Back Matter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackMatter()
	 * @generated
	 * @ordered
	 */
	protected BackMatter backMatter;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getComponentDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.COMPONENT_DEFINITION__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.COMPONENT_DEFINITION__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.COMPONENT_DEFINITION__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.COMPONENT_DEFINITION__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImportComponentDefinition> getImportComponentDefinition() {
		if (importComponentDefinition == null) {
			importComponentDefinition = new EObjectContainmentEList<ImportComponentDefinition>(ImportComponentDefinition.class, this, OSCALPackage.COMPONENT_DEFINITION__IMPORT_COMPONENT_DEFINITION);
		}
		return importComponentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefinedComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<DefinedComponent>(DefinedComponent.class, this, OSCALPackage.COMPONENT_DEFINITION__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Capability> getCapability() {
		if (capability == null) {
			capability = new EObjectContainmentEList<Capability>(Capability.class, this, OSCALPackage.COMPONENT_DEFINITION__CAPABILITY);
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackMatter getBackMatter() {
		return backMatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackMatter(BackMatter newBackMatter, NotificationChain msgs) {
		BackMatter oldBackMatter = backMatter;
		backMatter = newBackMatter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.COMPONENT_DEFINITION__BACK_MATTER, oldBackMatter, newBackMatter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackMatter(BackMatter newBackMatter) {
		if (newBackMatter != backMatter) {
			NotificationChain msgs = null;
			if (backMatter != null)
				msgs = ((InternalEObject)backMatter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.COMPONENT_DEFINITION__BACK_MATTER, null, msgs);
			if (newBackMatter != null)
				msgs = ((InternalEObject)newBackMatter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.COMPONENT_DEFINITION__BACK_MATTER, null, msgs);
			msgs = basicSetBackMatter(newBackMatter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.COMPONENT_DEFINITION__BACK_MATTER, newBackMatter, newBackMatter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.COMPONENT_DEFINITION__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.COMPONENT_DEFINITION__METADATA:
				return basicSetMetadata(null, msgs);
			case OSCALPackage.COMPONENT_DEFINITION__IMPORT_COMPONENT_DEFINITION:
				return ((InternalEList<?>)getImportComponentDefinition()).basicRemove(otherEnd, msgs);
			case OSCALPackage.COMPONENT_DEFINITION__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case OSCALPackage.COMPONENT_DEFINITION__CAPABILITY:
				return ((InternalEList<?>)getCapability()).basicRemove(otherEnd, msgs);
			case OSCALPackage.COMPONENT_DEFINITION__BACK_MATTER:
				return basicSetBackMatter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.COMPONENT_DEFINITION__METADATA:
				return getMetadata();
			case OSCALPackage.COMPONENT_DEFINITION__IMPORT_COMPONENT_DEFINITION:
				return getImportComponentDefinition();
			case OSCALPackage.COMPONENT_DEFINITION__COMPONENT:
				return getComponent();
			case OSCALPackage.COMPONENT_DEFINITION__CAPABILITY:
				return getCapability();
			case OSCALPackage.COMPONENT_DEFINITION__BACK_MATTER:
				return getBackMatter();
			case OSCALPackage.COMPONENT_DEFINITION__UUID:
				return getUuid();
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
			case OSCALPackage.COMPONENT_DEFINITION__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case OSCALPackage.COMPONENT_DEFINITION__IMPORT_COMPONENT_DEFINITION:
				getImportComponentDefinition().clear();
				getImportComponentDefinition().addAll((Collection<? extends ImportComponentDefinition>)newValue);
				return;
			case OSCALPackage.COMPONENT_DEFINITION__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends DefinedComponent>)newValue);
				return;
			case OSCALPackage.COMPONENT_DEFINITION__CAPABILITY:
				getCapability().clear();
				getCapability().addAll((Collection<? extends Capability>)newValue);
				return;
			case OSCALPackage.COMPONENT_DEFINITION__BACK_MATTER:
				setBackMatter((BackMatter)newValue);
				return;
			case OSCALPackage.COMPONENT_DEFINITION__UUID:
				setUuid((String)newValue);
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
			case OSCALPackage.COMPONENT_DEFINITION__METADATA:
				setMetadata((Metadata)null);
				return;
			case OSCALPackage.COMPONENT_DEFINITION__IMPORT_COMPONENT_DEFINITION:
				getImportComponentDefinition().clear();
				return;
			case OSCALPackage.COMPONENT_DEFINITION__COMPONENT:
				getComponent().clear();
				return;
			case OSCALPackage.COMPONENT_DEFINITION__CAPABILITY:
				getCapability().clear();
				return;
			case OSCALPackage.COMPONENT_DEFINITION__BACK_MATTER:
				setBackMatter((BackMatter)null);
				return;
			case OSCALPackage.COMPONENT_DEFINITION__UUID:
				setUuid(UUID_EDEFAULT);
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
			case OSCALPackage.COMPONENT_DEFINITION__METADATA:
				return metadata != null;
			case OSCALPackage.COMPONENT_DEFINITION__IMPORT_COMPONENT_DEFINITION:
				return importComponentDefinition != null && !importComponentDefinition.isEmpty();
			case OSCALPackage.COMPONENT_DEFINITION__COMPONENT:
				return component != null && !component.isEmpty();
			case OSCALPackage.COMPONENT_DEFINITION__CAPABILITY:
				return capability != null && !capability.isEmpty();
			case OSCALPackage.COMPONENT_DEFINITION__BACK_MATTER:
				return backMatter != null;
			case OSCALPackage.COMPONENT_DEFINITION__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
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
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //ComponentDefinitionImpl
