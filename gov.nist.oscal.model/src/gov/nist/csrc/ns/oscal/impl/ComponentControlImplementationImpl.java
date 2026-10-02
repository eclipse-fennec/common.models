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

import gov.nist.csrc.ns.oscal.ComponentControlImplementation;
import gov.nist.csrc.ns.oscal.ComponentImplementedRequirement;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.SetParameter;

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
 * An implementation of the model object '<em><b>Component Control Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentControlImplementationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentControlImplementationImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentControlImplementationImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentControlImplementationImpl#getSetParameter <em>Set Parameter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentControlImplementationImpl#getImplementedRequirement <em>Implemented Requirement</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentControlImplementationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ComponentControlImplementationImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentControlImplementationImpl extends MinimalEObjectImpl.Container implements ComponentControlImplementation {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultilineDatatype description;

	/**
	 * The cached value of the '{@link #getProp() <em>Prop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProp()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> prop;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getSetParameter() <em>Set Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<SetParameter> setParameter;

	/**
	 * The cached value of the '{@link #getImplementedRequirement() <em>Implemented Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentImplementedRequirement> implementedRequirement;

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
	protected ComponentControlImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getComponentControlImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultilineDatatype getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(MarkupMultilineDatatype newDescription, NotificationChain msgs) {
		MarkupMultilineDatatype oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(MarkupMultilineDatatype newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__PROP);
		}
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetParameter> getSetParameter() {
		if (setParameter == null) {
			setParameter = new EObjectContainmentEList<SetParameter>(SetParameter.class, this, OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__SET_PARAMETER);
		}
		return setParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentImplementedRequirement> getImplementedRequirement() {
		if (implementedRequirement == null) {
			implementedRequirement = new EObjectContainmentEList<ComponentImplementedRequirement>(ComponentImplementedRequirement.class, this, OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT);
		}
		return implementedRequirement;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__SET_PARAMETER:
				return ((InternalEList<?>)getSetParameter()).basicRemove(otherEnd, msgs);
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT:
				return ((InternalEList<?>)getImplementedRequirement()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__DESCRIPTION:
				return getDescription();
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__PROP:
				return getProp();
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__LINK:
				return getLink();
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__SET_PARAMETER:
				return getSetParameter();
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT:
				return getImplementedRequirement();
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__SOURCE:
				return getSource();
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__UUID:
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
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__SET_PARAMETER:
				getSetParameter().clear();
				getSetParameter().addAll((Collection<? extends SetParameter>)newValue);
				return;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT:
				getImplementedRequirement().clear();
				getImplementedRequirement().addAll((Collection<? extends ComponentImplementedRequirement>)newValue);
				return;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__SOURCE:
				setSource((String)newValue);
				return;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__UUID:
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
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__PROP:
				getProp().clear();
				return;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__LINK:
				getLink().clear();
				return;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__SET_PARAMETER:
				getSetParameter().clear();
				return;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT:
				getImplementedRequirement().clear();
				return;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__UUID:
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
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__DESCRIPTION:
				return description != null;
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__SET_PARAMETER:
				return setParameter != null && !setParameter.isEmpty();
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT:
				return implementedRequirement != null && !implementedRequirement.isEmpty();
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION__UUID:
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
		result.append(" (source: ");
		result.append(source);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //ComponentControlImplementationImpl
