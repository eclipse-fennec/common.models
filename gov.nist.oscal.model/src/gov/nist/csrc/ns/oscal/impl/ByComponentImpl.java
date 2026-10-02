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

import gov.nist.csrc.ns.oscal.ByComponent;
import gov.nist.csrc.ns.oscal.Export;
import gov.nist.csrc.ns.oscal.ImplementationStatus;
import gov.nist.csrc.ns.oscal.Inherited;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.ResponsibleRole;
import gov.nist.csrc.ns.oscal.Satisfied;
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
 * An implementation of the model object '<em><b>By Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl#getSetParameter <em>Set Parameter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl#getImplementationStatus <em>Implementation Status</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl#getExport <em>Export</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl#getInherited <em>Inherited</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl#getSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl#getComponentUuid <em>Component Uuid</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ByComponentImpl extends MinimalEObjectImpl.Container implements ByComponent {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getImplementationStatus() <em>Implementation Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationStatus()
	 * @generated
	 * @ordered
	 */
	protected ImplementationStatus implementationStatus;

	/**
	 * The cached value of the '{@link #getExport() <em>Export</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport()
	 * @generated
	 * @ordered
	 */
	protected Export export;

	/**
	 * The cached value of the '{@link #getInherited() <em>Inherited</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherited()
	 * @generated
	 * @ordered
	 */
	protected EList<Inherited> inherited;

	/**
	 * The cached value of the '{@link #getSatisfied() <em>Satisfied</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfied()
	 * @generated
	 * @ordered
	 */
	protected EList<Satisfied> satisfied;

	/**
	 * The cached value of the '{@link #getResponsibleRole() <em>Responsible Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleRole()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibleRole> responsibleRole;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentUuid() <em>Component Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentUuid() <em>Component Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentUuid()
	 * @generated
	 * @ordered
	 */
	protected String componentUuid = COMPONENT_UUID_EDEFAULT;

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
	protected ByComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getByComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.BY_COMPONENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.BY_COMPONENT__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.BY_COMPONENT__LINK);
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
			setParameter = new EObjectContainmentEList<SetParameter>(SetParameter.class, this, OSCALPackage.BY_COMPONENT__SET_PARAMETER);
		}
		return setParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationStatus getImplementationStatus() {
		return implementationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationStatus(ImplementationStatus newImplementationStatus, NotificationChain msgs) {
		ImplementationStatus oldImplementationStatus = implementationStatus;
		implementationStatus = newImplementationStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.BY_COMPONENT__IMPLEMENTATION_STATUS, oldImplementationStatus, newImplementationStatus);
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
	public void setImplementationStatus(ImplementationStatus newImplementationStatus) {
		if (newImplementationStatus != implementationStatus) {
			NotificationChain msgs = null;
			if (implementationStatus != null)
				msgs = ((InternalEObject)implementationStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.BY_COMPONENT__IMPLEMENTATION_STATUS, null, msgs);
			if (newImplementationStatus != null)
				msgs = ((InternalEObject)newImplementationStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.BY_COMPONENT__IMPLEMENTATION_STATUS, null, msgs);
			msgs = basicSetImplementationStatus(newImplementationStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.BY_COMPONENT__IMPLEMENTATION_STATUS, newImplementationStatus, newImplementationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Export getExport() {
		return export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExport(Export newExport, NotificationChain msgs) {
		Export oldExport = export;
		export = newExport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.BY_COMPONENT__EXPORT, oldExport, newExport);
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
	public void setExport(Export newExport) {
		if (newExport != export) {
			NotificationChain msgs = null;
			if (export != null)
				msgs = ((InternalEObject)export).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.BY_COMPONENT__EXPORT, null, msgs);
			if (newExport != null)
				msgs = ((InternalEObject)newExport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.BY_COMPONENT__EXPORT, null, msgs);
			msgs = basicSetExport(newExport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.BY_COMPONENT__EXPORT, newExport, newExport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Inherited> getInherited() {
		if (inherited == null) {
			inherited = new EObjectContainmentEList<Inherited>(Inherited.class, this, OSCALPackage.BY_COMPONENT__INHERITED);
		}
		return inherited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Satisfied> getSatisfied() {
		if (satisfied == null) {
			satisfied = new EObjectContainmentEList<Satisfied>(Satisfied.class, this, OSCALPackage.BY_COMPONENT__SATISFIED);
		}
		return satisfied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponsibleRole> getResponsibleRole() {
		if (responsibleRole == null) {
			responsibleRole = new EObjectContainmentEList<ResponsibleRole>(ResponsibleRole.class, this, OSCALPackage.BY_COMPONENT__RESPONSIBLE_ROLE);
		}
		return responsibleRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.BY_COMPONENT__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentUuid() {
		return componentUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentUuid(String newComponentUuid) {
		String oldComponentUuid = componentUuid;
		componentUuid = newComponentUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.BY_COMPONENT__COMPONENT_UUID, oldComponentUuid, componentUuid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.BY_COMPONENT__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.BY_COMPONENT__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.BY_COMPONENT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.BY_COMPONENT__SET_PARAMETER:
				return ((InternalEList<?>)getSetParameter()).basicRemove(otherEnd, msgs);
			case OSCALPackage.BY_COMPONENT__IMPLEMENTATION_STATUS:
				return basicSetImplementationStatus(null, msgs);
			case OSCALPackage.BY_COMPONENT__EXPORT:
				return basicSetExport(null, msgs);
			case OSCALPackage.BY_COMPONENT__INHERITED:
				return ((InternalEList<?>)getInherited()).basicRemove(otherEnd, msgs);
			case OSCALPackage.BY_COMPONENT__SATISFIED:
				return ((InternalEList<?>)getSatisfied()).basicRemove(otherEnd, msgs);
			case OSCALPackage.BY_COMPONENT__RESPONSIBLE_ROLE:
				return ((InternalEList<?>)getResponsibleRole()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.BY_COMPONENT__DESCRIPTION:
				return getDescription();
			case OSCALPackage.BY_COMPONENT__PROP:
				return getProp();
			case OSCALPackage.BY_COMPONENT__LINK:
				return getLink();
			case OSCALPackage.BY_COMPONENT__SET_PARAMETER:
				return getSetParameter();
			case OSCALPackage.BY_COMPONENT__IMPLEMENTATION_STATUS:
				return getImplementationStatus();
			case OSCALPackage.BY_COMPONENT__EXPORT:
				return getExport();
			case OSCALPackage.BY_COMPONENT__INHERITED:
				return getInherited();
			case OSCALPackage.BY_COMPONENT__SATISFIED:
				return getSatisfied();
			case OSCALPackage.BY_COMPONENT__RESPONSIBLE_ROLE:
				return getResponsibleRole();
			case OSCALPackage.BY_COMPONENT__REMARKS:
				return getRemarks();
			case OSCALPackage.BY_COMPONENT__COMPONENT_UUID:
				return getComponentUuid();
			case OSCALPackage.BY_COMPONENT__UUID:
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
			case OSCALPackage.BY_COMPONENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.BY_COMPONENT__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.BY_COMPONENT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.BY_COMPONENT__SET_PARAMETER:
				getSetParameter().clear();
				getSetParameter().addAll((Collection<? extends SetParameter>)newValue);
				return;
			case OSCALPackage.BY_COMPONENT__IMPLEMENTATION_STATUS:
				setImplementationStatus((ImplementationStatus)newValue);
				return;
			case OSCALPackage.BY_COMPONENT__EXPORT:
				setExport((Export)newValue);
				return;
			case OSCALPackage.BY_COMPONENT__INHERITED:
				getInherited().clear();
				getInherited().addAll((Collection<? extends Inherited>)newValue);
				return;
			case OSCALPackage.BY_COMPONENT__SATISFIED:
				getSatisfied().clear();
				getSatisfied().addAll((Collection<? extends Satisfied>)newValue);
				return;
			case OSCALPackage.BY_COMPONENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				getResponsibleRole().addAll((Collection<? extends ResponsibleRole>)newValue);
				return;
			case OSCALPackage.BY_COMPONENT__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.BY_COMPONENT__COMPONENT_UUID:
				setComponentUuid((String)newValue);
				return;
			case OSCALPackage.BY_COMPONENT__UUID:
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
			case OSCALPackage.BY_COMPONENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.BY_COMPONENT__PROP:
				getProp().clear();
				return;
			case OSCALPackage.BY_COMPONENT__LINK:
				getLink().clear();
				return;
			case OSCALPackage.BY_COMPONENT__SET_PARAMETER:
				getSetParameter().clear();
				return;
			case OSCALPackage.BY_COMPONENT__IMPLEMENTATION_STATUS:
				setImplementationStatus((ImplementationStatus)null);
				return;
			case OSCALPackage.BY_COMPONENT__EXPORT:
				setExport((Export)null);
				return;
			case OSCALPackage.BY_COMPONENT__INHERITED:
				getInherited().clear();
				return;
			case OSCALPackage.BY_COMPONENT__SATISFIED:
				getSatisfied().clear();
				return;
			case OSCALPackage.BY_COMPONENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				return;
			case OSCALPackage.BY_COMPONENT__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.BY_COMPONENT__COMPONENT_UUID:
				setComponentUuid(COMPONENT_UUID_EDEFAULT);
				return;
			case OSCALPackage.BY_COMPONENT__UUID:
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
			case OSCALPackage.BY_COMPONENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.BY_COMPONENT__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.BY_COMPONENT__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.BY_COMPONENT__SET_PARAMETER:
				return setParameter != null && !setParameter.isEmpty();
			case OSCALPackage.BY_COMPONENT__IMPLEMENTATION_STATUS:
				return implementationStatus != null;
			case OSCALPackage.BY_COMPONENT__EXPORT:
				return export != null;
			case OSCALPackage.BY_COMPONENT__INHERITED:
				return inherited != null && !inherited.isEmpty();
			case OSCALPackage.BY_COMPONENT__SATISFIED:
				return satisfied != null && !satisfied.isEmpty();
			case OSCALPackage.BY_COMPONENT__RESPONSIBLE_ROLE:
				return responsibleRole != null && !responsibleRole.isEmpty();
			case OSCALPackage.BY_COMPONENT__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.BY_COMPONENT__COMPONENT_UUID:
				return COMPONENT_UUID_EDEFAULT == null ? componentUuid != null : !COMPONENT_UUID_EDEFAULT.equals(componentUuid);
			case OSCALPackage.BY_COMPONENT__UUID:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", componentUuid: ");
		result.append(componentUuid);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //ByComponentImpl
